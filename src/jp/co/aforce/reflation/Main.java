package jp.co.aforce.reflation;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException{
		//練習問題１
		Class<TestEntity> testEntityClass = TestEntity.class;

		System.out.println("クラス名：" + testEntityClass.getName());
		System.out.print("メソッド名：");
		Method[] methods = testEntityClass.getDeclaredMethods();
		for (Method method : methods) {
			System.out.print(method.getName() + ",");
		}
		System.out.print("\n");
		
		System.out.print("フィールド名：");
		Field[] fields = testEntityClass.getDeclaredFields();
		for (Field field : fields) {
			System.out.print(field.getName() + ",");
		}
		System.out.print("\n");
		
		
		//練習問題２
		TestEntity testEntity = new TestEntity("01", "山田");
		Field nameField = testEntityClass.getDeclaredField("name");
		nameField.setAccessible(true);
		nameField.set(testEntity, "大山");
		
		
		//練習問題３
		nameField.get(testEntity);
		
		
	}
}
