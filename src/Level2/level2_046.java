package Level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class level2_046 {
	//[3차] 파일명 정렬
	public static void main(String[] args) {
		//String[] str = {"img.12ff555.png", "img10.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG"};
		String[] str = {"img.12.png", "img10.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG"};
		//String[] str = {"a0001", "a001", "a000001"};
		 //["a000001", "a0001", "a001"]
		//String[] str = {"F13.png", "F14", "f013", "F014", "F013.TXT", "F09",};
		//["F13.png", "f013", "F013.TXT", "F14", "F014"]
		//String[] str = {"img100.p2ng", "img202.png123"};
		
		//System.out.println(solution(str));
		System.out.println(Arrays.toString(solution(str)));
	}
	
	public static String[] solution(String[] files) {
        String[] answer = {};
//        Arrays.sort(files);
//        System.out.println(Arrays.toString(files));
////        for(String str : files) {
////        	System.out.println(str);
////        	str = str.split("\\d+");
////        	System.out.println(str);
////        }
//        String str = "";
//        String[] str01 = {};
//        for(int i = 0; i < files.length;i++) {
//        	str = files[i].split("\\d+")[0];
//        	str01 = str.split("\\d+");
//        	str = str.split("\\d+")[0].toLowerCase();
//        	System.out.println(str);
//        	System.out.println(Arrays.toString(str01));
//        }
//        return answer;
        
//        String[] temp = {};
//        int iNum = 0, jNum = 0;
//        answer = files;
//        //temp = files[0].split("\\d+\\|\\D+");
//        temp = "a000001".split("\\d+|\\D+");
//        System.out.println(Arrays.toString(temp));
//        for(int i = 0; i < files.length;i++){
//            for(int j = 0; j < files.length;j++){
//            	int cnt = files[i].split("\\d+")[0].compareToIgnoreCase(files[j].split("\\d+")[0]);
//                if(cnt < 0){
//                    temp = files[j];
//                    files[j] = files[i];
//                    files[i] = temp;
//                } else if(cnt == 0){
//                	iNum = files[i].split("\\D+")[1].length() <= 5 ? Integer.parseInt(files[i].split("\\D+")[1]) : Integer.parseInt(files[i].split("\\D+")[1].substring(0,5));
//                	jNum = files[j].split("\\D+")[1].length() <= 5 ? Integer.parseInt(files[j].split("\\D+")[1]) : Integer.parseInt(files[j].split("\\D+")[1].substring(0,5));
//                    if(iNum < jNum){
//                        temp = files[j];
//                        files[j] = files[i];
//                        files[i] = temp;
//                    } else if (iNum == jNum) {
//                    	if(Arrays.asList(answer).indexOf(files[i]) < Arrays.asList(answer).indexOf(files[j])) {
//                    		temp = files[j];
//                            files[j] = files[i];
//                            files[i] = temp;
//                    	}
//                    }
//                }
//            }
//        }
//        answer = files;
//        return answer;
//        List<String> idList = new ArrayList<String>(Arrays.asList(files));
//        String[] iStrArr = {};
//        String[] jStrArr = {};
//        int cnt = 0, iNum = 0, jNum = 0;
//        String temp = "";
//        
//        for(int i = 0; i < files.length; i++){
//            for(int j = 0; j < files.length; j++){
//                iStrArr = files[i].split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");
//                jStrArr = files[j].split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");
//                cnt = iStrArr[0].compareToIgnoreCase(jStrArr[0]);
//                if(cnt < 0){
//                    temp = files[j];
//                    files[j] = files[i];
//                    files[i] = temp;
//                } else if(cnt == 0) {
//                    iNum = iStrArr[1].length() <= 5 ? Integer.valueOf(iStrArr[1]).intValue() : Integer.valueOf(iStrArr[1].substring(0, 5)).intValue();
//                    jNum = jStrArr[1].length() <= 5 ? Integer.valueOf(jStrArr[1]).intValue() : Integer.valueOf(jStrArr[1].substring(0, 5)).intValue();
//                    if(iNum < jNum){
//                        temp = files[j];
//                        files[j] = files[i];
//                        files[i] = temp;
//                    } else if (iNum == jNum){
//                        if(idList.indexOf(files[i]) < idList.indexOf(files[j])){
//                            temp = files[j];
//                            files[j] = files[i];
//                            files[i] = temp;
//                        }
//                    }
//                }
//            }
//        }
//        answer = files;
//        return answer;
        
        List<String> idList = new ArrayList<String>(Arrays.asList(files));
        Arrays.sort(files, (iStr, jStr) -> {
        	String[] iStrArr = ((String) iStr).split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");
        	String[] jStrArr = ((String) jStr).split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");
        	int cnt = iStrArr[0].compareToIgnoreCase(jStrArr[0]);
        	int iNum = iStrArr[1].length() <= 5 ? Integer.valueOf(iStrArr[1]).intValue() : Integer.valueOf(iStrArr[1].substring(0, 5)).intValue();
			int jNum = jStrArr[1].length() <= 5 ? Integer.valueOf(jStrArr[1]).intValue() : Integer.valueOf(jStrArr[1].substring(0, 5)).intValue();
        	if (cnt == 0) {
        		if(iNum == jNum) {
        			return 0;
        		}
                return iNum - jNum;
            }
            return cnt;
        });
        //int cnt = 0, iNum = 0, jNum = 0;
//        String temp = "";
//                
//        for(int i = 0; i < files.length - 1; i++){
//        		iStrArr = files[i].split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");
//        		jStrArr = files[i + 1].split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");
//        		cnt = iStrArr[0].compareToIgnoreCase(jStrArr[0]);
//        		if(cnt < 0){
//        			temp = files[i + 1];
//        			files[i + 1] = files[i];
//        			files[i] = temp;
//        		} else if(cnt == 0) {
//        			iNum = iStrArr[1].length() <= 5 ? Integer.valueOf(iStrArr[1]).intValue() : Integer.valueOf(iStrArr[1].substring(0, 5)).intValue();
//        			jNum = jStrArr[1].length() <= 5 ? Integer.valueOf(jStrArr[1]).intValue() : Integer.valueOf(jStrArr[1].substring(0, 5)).intValue();
//        			if(iNum < jNum){
//        				temp = files[i + 1];
//        				files[i + 1] = files[i];
//        				files[i] = temp;
//        			} else if (iNum == jNum){
//        				if(idList.indexOf(files[i]) < idList.indexOf(files[i + 1])){
//        					temp = files[i + 1];
//        					files[i + 1] = files[i];
//        					files[i] = temp;
//        				}
//        			}
//        		}
//        	}
        answer = files;
        return answer;
	}
}