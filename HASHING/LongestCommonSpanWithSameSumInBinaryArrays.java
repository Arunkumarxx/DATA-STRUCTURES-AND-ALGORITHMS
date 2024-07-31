package HASHING;

import java.util.Arrays;
import java.util.HashMap;

public class LongestCommonSpanWithSameSumInBinaryArrays {
    public static void main(String[] args) {
        int[] arr1 = {0, 1, 0, 1, 1, 1, 1};
        int[] arr2 = {1, 1, 1, 1, 1, 0, 1};
        int n1 = arr1.length;
        int n2 = arr2.length;
        System.out.println(Optimal(arr1, arr2, n1, n2));
    }
    private static int Optimal(int[] arr1, int[] arr2, int n1, int n2) {
        int[] temp = new int[n1];
        int tn = temp.length;
        for (int i = 0; i < tn; ++i)
            temp[i] = arr1[i] - arr2[i];
        int sum = 0;
        int res = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(0, -1);
        for (int i = 0; i < tn; ++i) {
            sum += temp[i];
            if (sum == 0 || hashMap.containsKey(sum))
                if (i - hashMap.get(sum) > res)
                    res = Math.max(res, i - hashMap.get(sum));
            if (!hashMap.containsKey(sum))
                hashMap.put(sum, i);
        }
        System.out.println(Arrays.toString(temp));
        return res;
    }
}

/*
# Define the path to the exiftool executable
$exiftoolPath = "C:\Windows\exiftool-12.92_64\exiftool(-k).exe"

# Define the directory containing the image files
$directory = "K:\Photos"

# Function to extract datetime from the filename
function Get-DateTimeFromFilename {
    param (
        [string]$filename
    )

    # Regular expressions to match the date and time in the filename
    $regexPatterns = @(
        [regex]::new('(\d{8})_(\d{6})'), # Matches YYYYMMDD_HHMMSS
        [regex]::new('(\d{8})-WA\d+'),   # Matches YYYYMMDD-WAXXXX (where WA is a fixed string)
        [regex]::new('IMG-(\d{8})-WA\d+') # Matches IMG-YYYYMMDD-WAXXXX
    )

    foreach ($regex in $regexPatterns) {
        $match = $regex.Match($filename)

        if ($match.Success) {
            $date = $match.Groups[1].Value
            $time = "120000"  # Default to noon if time is not specified
            return "{0}:{1}:{2} {3}:{4}:{5}" -f $date.Substring(0, 4), $date.Substring(4, 2), $date.Substring(6, 2), $time.Substring(0, 2), $time.Substring(2, 2), $time.Substring(4, 2)
        }
    }

    return $null
}

# Function to set the creation date using exiftool
function Set-CreationDate {
    param (
        [string]$filePath,
        [string]$datetime
    )

    $cmd = "& `"$exiftoolPath`" -datetimeoriginal=`"$datetime`" -createDate=`"$datetime`" -modifyDate=`"$datetime`" -overwrite_original `"$filePath`""
    Invoke-Expression $cmd
}

# Process each image file in the directory
Get-ChildItem -Path $directory | Where-Object { $_.Extension -match "jpg|jpeg" } | ForEach-Object {
    $filename = $_.Name
    $filePath = $_.FullName

    $datetime = Get-DateTimeFromFilename -filename $filename

    if ($datetime) {
        Set-CreationDate -filePath $filePath -datetime $datetime
        Write-Output "Successfully updated metadata for $filePath"
    } else {
        Write-Output "Failed to extract date and time from filename: $filename"
    }
}

 */












/*
# Define the path to the exiftool executable
$exiftoolPath = "C:\Windows\exiftool-12.92_64\exiftool(-k).exe"

# Define the directory containing the image files
$directory = "T:\PERSONAL VAULT\PHOTOS2\Photos from 2019"

# Function to extract datetime from the filename
function Get-DateTimeFromFilename {
    param (
        [string]$filename
    )

    # Regex pattern to match date and time in different formats
    $regexPattern = [regex]::new('(\d{4})[._-](\d{2})[._-](\d{2})(?:[ _-](\d{2})(\d{2})(\d{2}))?')

    $match = $regexPattern.Match($filename)

    if ($match.Success) {
        $year = $match.Groups[1].Value
        $month = $match.Groups[2].Value
        $day = $match.Groups[3].Value
        $hour = $match.Groups[4].Value
        $minute = $match.Groups[5].Value
        $second = $match.Groups[6].Value

        # Default time to 00:00:00 if not provided
        if (-not $hour) { $hour = "00" }
        if (-not $minute) { $minute = "00" }
        if (-not $second) { $second = "00" }

        return "{0}:{1}:{2} {3}:{4}:{5}" -f $year, $month, $day, $hour, $minute, $second
    }

    return $null
}

# Function to set the creation date using exiftool
function Set-CreationDate {
    param (
        [string]$filePath,
        [string]$datetime
    )

    $cmd = "& `"$exiftoolPath`" -datetimeoriginal=`"$datetime`" -createDate=`"$datetime`" -modifyDate=`"$datetime`" -overwrite_original `"$filePath`""
    Invoke-Expression $cmd
}

# Function to process each file
function Process-File {
    param (
        [string]$filePath
    )

    $filename = [System.IO.Path]::GetFileName($filePath)
    $datetime = Get-DateTimeFromFilename -filename $filename

    if ($datetime) {
        Set-CreationDate -filePath $filePath -datetime $datetime
        Write-Output "Successfully updated metadata for $filePath"
    } else {
        Write-Output "Failed to extract date and time from filename: $filename"
    }
}

# Prepare runspaces for parallel processing
$runspacePool = [runspacefactory]::CreateRunspacePool(1, 8)
$runspacePool.Open()

$runspaces = @()
$files = Get-ChildItem -Path $directory -Recurse | Where-Object { $_.Extension -match "jpg|jpeg" }

foreach ($file in $files) {
    $runspace = [powershell]::Create().AddScript({
        param ($filePath)
        Process-File -filePath $filePath
    }).AddArgument($file.FullName)
    $runspace.RunspacePool = $runspacePool
    $asyncResult = $runspace.BeginInvoke()
    $runspaces += [PSCustomObject]@{ Pipe = $runspace; AsyncResult = $asyncResult; File = $file.FullName }
}

# Wait for all runspaces to complete
foreach ($runspace in $runspaces) {
    $runspace.AsyncResult.AsyncWaitHandle.WaitOne()
    $runspace.Pipe.EndInvoke($runspace.AsyncResult)
    $runspace.Pipe.Dispose()
}

$runspacePool.Close()
$runspacePool.Dispose()

 */