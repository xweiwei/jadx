package jadx.core;

import jadx.core.utils.Utils;

public class Consts {
	public static final String JADX_VERSION = Utils.getJadxVersion();

	public static final boolean DEBUG = false;

	public static final String CLASS_OBJECT = "java.lang.Object";
	public static final String CLASS_STRING = "java.lang.String";
	public static final String CLASS_CLASS = "java.lang.Class";
	public static final String CLASS_THROWABLE = "java.lang.Throwable";
	public static final String CLASS_ENUM = "java.lang.Enum";

	public static final String CLASS_STRING_BUILDER = "java.lang.StringBuilder";

	public static final String DALVIK_ANNOTATION_PKG = "dalvik.annotation.";
	public static final String DALVIK_SIGNATURE = "dalvik.annotation.Signature";
	public static final String DALVIK_INNER_CLASS = "dalvik.annotation.InnerClass";
	public static final String DALVIK_THROWS = "dalvik.annotation.Throws";
	public static final String DALVIK_ANNOTATION_DEFAULT = "dalvik.annotation.AnnotationDefault";

	public static final String DEFAULT_PACKAGE_NAME = "defpackage";
}