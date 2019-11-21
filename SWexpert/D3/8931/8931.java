import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution { // SW expert 8931

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test_case;
		String str = br.readLine();
		test_case = Integer.valueOf(str);
		for (int i = 0; i < test_case; i++) {
			int j = Integer.valueOf(br.readLine());
			int count = 0;
			String strs[] = new String[j];
			for (int k = 0; k < j; k++) {
				String strNum = br.readLine();
				strs[k] = strNum;
				int intNum = Integer.valueOf(strNum);
				if (intNum != 0) {
					count++;
				}
			} // 테스트케이스 k 횟수만큼 for문 돌려서 숫자 0이 아니면 count++
			int arr[] = new int[count]; // 0이 아닌 숫자개수만큼 배열 선언
			for (int k = 0; k < j; k++) {
				int intNum = Integer.valueOf(strs[k]);
				if (intNum != 0) { // 읽어들인 숫자가 0이 아니면
					for (int l = 0; l < arr.length; l++) {
						if (arr[l] == 0) {
							arr[l] = intNum;
							break;
						}
					} // 배열 앞에서부터 체크해서 숫자 넣기
				}
				else if(intNum == 0)// 읽어들인 숫자가 0이면
				{
					for (int l = (arr.length - 1); l >= 0; l--) // 배열의 뒤에서부터 체크해서 값 들어있으면 배열 초기화
					{
						if (arr[l] != 0) {
							arr[l] = 0;
							break;
						}
					}
				} // 읽어들인 숫자 0일 경우 배열 뒤쪽 숫자 삭제처리 완료
			}
			count = 0;
			for (int z = 0; z < arr.length; z++) {
				count += arr[z];
			}
			System.out.println("#" + (i + 1) + " " + count);
		} // test_case만큼 for문
	}
}
