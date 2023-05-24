package rakuten_SS;
public class MatchGame {
	public static void main(String[] args) {
		String[] muzam = {"Violet","Idigo","Blue","Green","Yellow","Orange","Red"};
		String[] sunny = {"Pink","Peach","Sandal","Black","Grey","Wine",
				"Ash","White","Purple","Violet","Brown","Burgandy",
				"Magenta","Crimson","Navy Blue","Gold","Silver","Bronze"};
		int i = 0,j = 0,k = 0;
		String[] common = new String[muzam.length+sunny.length];
		
		while(i<muzam.length && j<sunny.length) {
			common[k++] = muzam[i++];
			common[k++] = sunny[j++];
		}
		while(i<muzam.length) {
			common[k++] = muzam[i++];
		}
		while(j<sunny.length) {
			common[k++] = sunny[j++];
		}
		ArrayUtility.displayArray(common);
	}
}
