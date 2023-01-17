import java.util.*;
class Binery
{
public static void main(String[] s)
{
int arr[]=new int[10];
int i,mid=0,f=0,l=9,val,flag=0;
Scanner kb=new Scanner(System.in);
for(i=0;i<10;i++)
{
System.out.println("Enter array elements for searching");
arr[i]=kb.nextInt();
}
System.out.println("Enter element when you want to be search");
val=kb.nextInt();
while(f<=l && flag==0)
{
mid=(l+f)/2;
if(mid==val)
{
    flag=1;
System.out.println("Binery searching position of element is="+(mid+1));
}
if(arr[mid]<val)
f=mid+1;
if(arr[mid]>val)
l=mid-1;
}

if(flag==0)
System.out.println("Binery searching position of element is="+val);
else
System.out.println("Binery searching position of element is not fount ");

}



}