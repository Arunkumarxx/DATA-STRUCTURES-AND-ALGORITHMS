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
$exiftoolPath = ""

# Define the directory containing the image files
$directory = "K:\photos"

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