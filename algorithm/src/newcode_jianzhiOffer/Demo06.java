package newcode_jianzhiOffer;
/*
 * ��һ�������ʼ�����ɸ�Ԫ�ذᵽ�����ĩβ�����ǳ�֮Ϊ�������ת�� ����һ���ǵݼ�����������һ����ת��
 * �����ת�������СԪ�ء� ��������{3,4,5,1,2}Ϊ{1,2,3,4,5}��һ����ת�����������СֵΪ1�� 
 * NOTE������������Ԫ�ض�����0���������СΪ0���뷵��0��
 */
public class Demo06 {
	public int minNumberInRotateArray(int [] array) {
	    if(array.length==0)return 0;
	    for (int i = 1; i < array.length; i++) {
			if(array[i]<array[i-1])return array[i];
		}
	    
	    return 0;
    }
	
	public int minNumberInRotateArray2(int [] array) {
		if(array.length==0)return 0;
	    if(array.length==0)return 0;
	    int start = 0;
	    int end = array.length-1;
	    int mid=(end+start)/2;
	    while(end-start>1){
	    	mid = (end+start)/2;
	    	if(array[mid]>=array[start]){
	    		start = mid;
	    	}else{
	    		end = mid;
	    	}	    	
	    }
	    return array[end];
    }
}
