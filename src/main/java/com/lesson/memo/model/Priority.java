package com.lesson.memo.model;

	//Priority enum を追加（高/中/低）
	public enum Priority{
		HIGH("高"),
		MEDIUM("中"),
		LOW("低");
		
		private final String displayName;
		
		Priority(String displayName){
			this.displayName = displayName;
		}
		public String getDisplayName() {
			return displayName;
		}
	}
