/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SortingandSearching;

/**
 *
 * @author zulfikar
 */
public class BinarySearch {
    
    int[]data;
    int size;
    
    public boolean binarySearch(int key) {
    int min = 0;
    int max = size - 1;
        
    while(max >= min)
    
{
    int middle = (min + max) / 2;
    if(data[middle] == key){
        return true;
    }
    
    if(data[middle] < key) {
        min = middle + 1;
    }
    if (data[middle] > key) {
        max = middle - 1;
    }
}
    return false;
}}
