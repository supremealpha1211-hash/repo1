package com.banner;

public class BannerAppUC8 {

    public static void main(String[] args) {
        renderBanner("OOPS");
    }

    private static void renderBanner(String word) {
        int patternHeight = 5;

        for (int row = 0; row < patternHeight; row++) {
            for (char ch : word.toCharArray()) {
                String[] pattern = CharacterPatternStore.getPattern(ch);
                if (pattern != null) {
                    System.out.print(pattern[row] + "  ");
                }
            }
            System.out.println();
        }
    }
}