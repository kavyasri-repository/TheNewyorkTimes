package com.newyorktimes.Listeners;

import org.testng.annotations.ITestAnnotation;
import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class AnnotationTransformer implements IAnnotationTransformer {
	@Override
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		annotation.setRetryAnalyzer((Class<? extends IRetryAnalyzer>) Retry.class);
	}
}
