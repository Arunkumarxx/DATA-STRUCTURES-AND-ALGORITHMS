package JAVA_COLLECTION_FRAMEWORK;

import javax.management.relation.RoleUnresolvedList;
import java.util.Collection;
import java.util.LinkedList;


class COLLECTIONINTERFACEOVERVIEW {
    public static void main(String[] args) {
        Collection<String> stringCollection = (Collection<String>) new LinkedList();
        RoleUnresolvedList integerRoleUnresolvedList = new RoleUnresolvedList();
        integerRoleUnresolvedList.add(12);
        stringCollection.add("Geeks");
        stringCollection.add("For");
        stringCollection.add("Geeks");
        System.out.println(stringCollection);
        stringCollection.add("last");
        stringCollection.add("Element");
        System.out.println(stringCollection);
    }
}
