package d_array;

import java.util.Arrays;

public class Score {

	public static void main(String[] args) {
		/*
		 * 우리반 모두의 국어, 영어, 수학, 사회, 과학, Oracle, Java 점수를 0 ~ 100 랜덤생선하고 아래와 같이 출력
		 * 
		 * 홍길동 : 국 영 수 사 과 oracle java 합계 홍길동 : 1 2 3 4 5 6 7 합계 홍길동은 총 5명 과목 합계
		 * 과목 평균
		 */

		int[][] scores = new int[25][8]; // int[학생수][과목수]
		int[] sum = new int[scores.length]; // 합계
		double[] avg = new double[scores.length]; // 평균
		String[] title =  new String[] {"이름", "국어", "영어", "수학", "사회", "과학", "Oracle", "Java", "합계 ", "평균", "석차"};
		/*String[] name[] = { { "김경찬" }, { "김우성" }, { "김형석" }, { "안용현" },
				{ "유승종" }, { "김강영" }, { "김건호" }, { "김도영" }, { "김보연" },
				{ "김선중" }, { "김수연" }, { "김준혁" }, { "박소영" }, { "백수진" },
				{ "송하섭" }, { "오제현" }, { "유동기" }, { "이건영" }, { "이수정" },
				{ "이수훈" }, { "이연승" }, { "이예슬" }, { "전영헌" }, { "최동준" },
				{ "황시연" } };*/
		String[] name = new String[] { "김경찬", "김우성", "김형석" ,  "안용현" ,
				 "유승종" ,  "김강영" ,  "김건호" ,  "김도영" ,  "김보연" ,
				 "김선중" ,  "김수연" ,  "김준혁" ,  "박소영" ,  "백수진" ,
				 "송하섭" ,  "오제현" ,  "유동기" ,  "이건영" ,  "이수정" ,
				 "이수훈" ,  "이연승" ,  "이예슬" ,  "전영헌" ,  "최동준" ,
				 "황시연"  };

		//이름 배치 및 성적 배치
		System.out.println(Arrays.toString(title)); //메뉴칸 출력
		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores[i].length; j++) {
				scores[i][j] = (int) (Math.random() * 101);
/*				System.out.print(" scores[" + i + "][" + j + "] : "
						+ scores[i][j]);
				*/
			}
			
			//System.out.println("\n" + name[i] +  " : "+ Arrays.toString(scores[i]));
		}
		
		// 합계와 평균 구하기
		String res1[] = new String[11];
		for (int i = 0; i < scores.length; i++) { // 이 길이값은 3
			for (int j = 0; j < scores[i].length; j++) { // 이 길이값은 5
				sum[i] += scores[i][j];
			}
			// 선생님이 짠 소스 내꺼하고 비슷함 그래서 빠진것만 추가한거
			avg[i] = (double) sum[i] / scores[i].length;
//			System.out.println(" 점수 합:" + sum[i]);
			//System.out.println("합계 : " + sum[i] + " / 평균 : " + avg[i]);
//			System.out.println("\n" + name[i] +  " : "+ Arrays.toString(scores[i]) + " " + sum[i] + " " + avg[i]);
/*			//실패
			res1[0] = name[i];
			res1[1] = Arrays.toString(scores[0]);			
			res1[2] = Arrays.toString(scores[1]);			
			res1[3] = Arrays.toString(scores[2]);			
			res1[4] = Arrays.toString(scores[3]);			
			res1[5] = Arrays.toString(scores[4]);			
			res1[6] = Arrays.toString(scores[5]);			
			res1[7] = Arrays.toString(scores[6]);			
			res1[8] = Arrays.toString(scores[7]);
			String sum = (String)sum[i];
			res1[9] = sum[i];			
*/			System.out.println(name[i] +  " : " + Arrays.toString(scores[i]) + " " + sum[i] + " " + avg[i]);
		}
		//석차 구하기
		int[] rank = new int[name.length];
		for (int i = 0; i < rank.length; i++) {
			rank[i] = 1;
		}

		for (int i = 0; i < rank.length; i++) {
			for (int j = 0; j < scores[i].length; j++) {
				if (scores[i][j] < scores[i][j]) {
					rank[i]++;
				}
			}
/*			System.out.println("\n" + name[i] +  " : "
			+ Arrays.toString(scores[i]) + " " + sum[i] + " " + avg[i]
			+ " " + rank[i]);
			*/
			
		}
		System.out.println(Arrays.toString(rank));

	}

}
