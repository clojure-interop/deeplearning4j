(ns org.nd4j.linalg.io.ClassUtils
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.io ClassUtils]))

(defn ->class-utils
  "Constructor."
  (^ClassUtils []
    (new ClassUtils )))

(def *-array-suffix
  "Static Constant.

  type: java.lang.String"
  ClassUtils/ARRAY_SUFFIX)

(def *-cglib-class-separator
  "Static Constant.

  type: java.lang.String"
  ClassUtils/CGLIB_CLASS_SEPARATOR)

(def *-class-file-suffix
  "Static Constant.

  type: java.lang.String"
  ClassUtils/CLASS_FILE_SUFFIX)

(defn *create-composite-interface
  "interfaces - `java.lang.Class[]`
  class-loader - `java.lang.ClassLoader`

  returns: `java.lang.Class<?>`"
  (^java.lang.Class [interfaces ^java.lang.ClassLoader class-loader]
    (ClassUtils/createCompositeInterface interfaces class-loader)))

(defn *cglib-proxy?
  "object - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^java.lang.Object object]
    (ClassUtils/isCglibProxy object)))

(defn *add-resource-path-to-package-path
  "clazz - `java.lang.Class`
  resource-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.Class clazz ^java.lang.String resource-name]
    (ClassUtils/addResourcePathToPackagePath clazz resource-name)))

(defn *matches-type-name
  "clazz - `java.lang.Class`
  type-name - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^java.lang.Class clazz ^java.lang.String type-name]
    (ClassUtils/matchesTypeName clazz type-name)))

(defn *assignable?
  "lhs-type - `java.lang.Class`
  rhs-type - `java.lang.Class`

  returns: `boolean`"
  (^Boolean [^java.lang.Class lhs-type ^java.lang.Class rhs-type]
    (ClassUtils/isAssignable lhs-type rhs-type)))

(defn *get-most-specific-method
  "method - `java.lang.reflect.Method`
  target-class - `java.lang.Class`

  returns: `java.lang.reflect.Method`"
  (^java.lang.reflect.Method [^java.lang.reflect.Method method ^java.lang.Class target-class]
    (ClassUtils/getMostSpecificMethod method target-class)))

(defn *get-package-name
  "clazz - `java.lang.Class`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.Class clazz]
    (ClassUtils/getPackageName clazz)))

(defn *get-method-count-for-name
  "clazz - `java.lang.Class`
  method-name - `java.lang.String`

  returns: `int`"
  (^Integer [^java.lang.Class clazz ^java.lang.String method-name]
    (ClassUtils/getMethodCountForName clazz method-name)))

(defn *get-all-interfaces-as-set
  "instance - `java.lang.Object`

  returns: `java.util.Set<java.lang.Class>`"
  (^java.util.Set [^java.lang.Object instance]
    (ClassUtils/getAllInterfacesAsSet instance)))

(defn *for-name
  "name - `java.lang.String`
  class-loader - `java.lang.ClassLoader`

  returns: `java.lang.Class<?>`

  throws: java.lang.ClassNotFoundException"
  (^java.lang.Class [^java.lang.String name ^java.lang.ClassLoader class-loader]
    (ClassUtils/forName name class-loader))
  (^java.lang.Class [^java.lang.String name]
    (ClassUtils/forName name)))

(defn *has-at-least-one-method-with-name?
  "clazz - `java.lang.Class`
  method-name - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^java.lang.Class clazz ^java.lang.String method-name]
    (ClassUtils/hasAtLeastOneMethodWithName clazz method-name)))

(defn *present?
  "class-name - `java.lang.String`
  class-loader - `java.lang.ClassLoader`

  returns: `boolean`"
  (^Boolean [^java.lang.String class-name ^java.lang.ClassLoader class-loader]
    (ClassUtils/isPresent class-name class-loader))
  (^Boolean [^java.lang.String class-name]
    (ClassUtils/isPresent class-name)))

(defn *get-default-class-loader
  "returns: `java.lang.ClassLoader`"
  (^java.lang.ClassLoader []
    (ClassUtils/getDefaultClassLoader )))

(defn *to-class-array
  "collection - `java.util.Collection`

  returns: `java.lang.Class<?>[]`"
  ([^java.util.Collection collection]
    (ClassUtils/toClassArray collection)))

(defn *cache-safe?
  "clazz - `java.lang.Class`
  class-loader - `java.lang.ClassLoader`

  returns: `boolean`"
  (^Boolean [^java.lang.Class clazz ^java.lang.ClassLoader class-loader]
    (ClassUtils/isCacheSafe clazz class-loader)))

(defn *cglib-proxy-class-name?
  "class-name - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^java.lang.String class-name]
    (ClassUtils/isCglibProxyClassName class-name)))

(defn *get-class-file-name
  "clazz - `java.lang.Class`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.Class clazz]
    (ClassUtils/getClassFileName clazz)))

(defn *get-user-class
  "instance - `java.lang.Object`

  returns: `java.lang.Class<?>`"
  (^java.lang.Class [^java.lang.Object instance]
    (ClassUtils/getUserClass instance)))

(defn *primitive-array?
  "clazz - `java.lang.Class`

  returns: `boolean`"
  (^Boolean [^java.lang.Class clazz]
    (ClassUtils/isPrimitiveArray clazz)))

(defn *get-all-interfaces
  "instance - `java.lang.Object`

  returns: `java.lang.Class<?>[]`"
  ([^java.lang.Object instance]
    (ClassUtils/getAllInterfaces instance)))

(defn *resolve-primitive-class-name
  "name - `java.lang.String`

  returns: `java.lang.Class<?>`"
  (^java.lang.Class [^java.lang.String name]
    (ClassUtils/resolvePrimitiveClassName name)))

(defn *primitive-or-wrapper?
  "clazz - `java.lang.Class`

  returns: `boolean`"
  (^Boolean [^java.lang.Class clazz]
    (ClassUtils/isPrimitiveOrWrapper clazz)))

(defn *primitive-wrapper-array?
  "clazz - `java.lang.Class`

  returns: `boolean`"
  (^Boolean [^java.lang.Class clazz]
    (ClassUtils/isPrimitiveWrapperArray clazz)))

(defn *resolve-primitive-if-necessary
  "clazz - `java.lang.Class`

  returns: `java.lang.Class<?>`"
  (^java.lang.Class [^java.lang.Class clazz]
    (ClassUtils/resolvePrimitiveIfNecessary clazz)))

(defn *get-all-interfaces-for-class-as-set
  "clazz - `java.lang.Class`
  class-loader - `java.lang.ClassLoader`

  returns: `java.util.Set<java.lang.Class>`"
  (^java.util.Set [^java.lang.Class clazz ^java.lang.ClassLoader class-loader]
    (ClassUtils/getAllInterfacesForClassAsSet clazz class-loader))
  (^java.util.Set [^java.lang.Class clazz]
    (ClassUtils/getAllInterfacesForClassAsSet clazz)))

(defn *resolve-class-name
  "class-name - `java.lang.String`
  class-loader - `java.lang.ClassLoader`

  returns: `java.lang.Class<?>`

  throws: java.lang.IllegalArgumentException"
  (^java.lang.Class [^java.lang.String class-name ^java.lang.ClassLoader class-loader]
    (ClassUtils/resolveClassName class-name class-loader)))

(defn *has-constructor?
  "clazz - `java.lang.Class`
  param-types - `java.lang.Class`

  returns: `boolean`"
  (^Boolean [^java.lang.Class clazz ^java.lang.Class param-types]
    (ClassUtils/hasConstructor clazz param-types)))

(defn *convert-class-name-to-resource-path
  "class-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String class-name]
    (ClassUtils/convertClassNameToResourcePath class-name)))

(defn *class-package-as-resource-path
  "clazz - `java.lang.Class`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.Class clazz]
    (ClassUtils/classPackageAsResourcePath clazz)))

(defn *get-qualified-name
  "clazz - `java.lang.Class`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.Class clazz]
    (ClassUtils/getQualifiedName clazz)))

(defn *get-short-name
  "class-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String class-name]
    (ClassUtils/getShortName class-name)))

(defn *get-method-if-available
  "clazz - `java.lang.Class`
  method-name - `java.lang.String`
  param-types - `java.lang.Class`

  returns: `java.lang.reflect.Method`"
  (^java.lang.reflect.Method [^java.lang.Class clazz ^java.lang.String method-name ^java.lang.Class param-types]
    (ClassUtils/getMethodIfAvailable clazz method-name param-types)))

(defn *convert-resource-path-to-class-name
  "resource-path - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String resource-path]
    (ClassUtils/convertResourcePathToClassName resource-path)))

(defn *primitive-wrapper?
  "clazz - `java.lang.Class`

  returns: `boolean`"
  (^Boolean [^java.lang.Class clazz]
    (ClassUtils/isPrimitiveWrapper clazz)))

(defn *visible?
  "clazz - `java.lang.Class`
  class-loader - `java.lang.ClassLoader`

  returns: `boolean`"
  (^Boolean [^java.lang.Class clazz ^java.lang.ClassLoader class-loader]
    (ClassUtils/isVisible clazz class-loader)))

(defn *assignable-value?
  "type - `java.lang.Class`
  value - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^java.lang.Class type ^java.lang.Object value]
    (ClassUtils/isAssignableValue type value)))

(defn *get-short-name-as-property
  "clazz - `java.lang.Class`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.Class clazz]
    (ClassUtils/getShortNameAsProperty clazz)))

(defn *get-constructor-if-available
  "clazz - `java.lang.Class`
  param-types - `java.lang.Class`

  returns: `<T> java.lang.reflect.Constructor<T>`"
  ([^java.lang.Class clazz ^java.lang.Class param-types]
    (ClassUtils/getConstructorIfAvailable clazz param-types)))

(defn *get-method
  "clazz - `java.lang.Class`
  method-name - `java.lang.String`
  param-types - `java.lang.Class`

  returns: `java.lang.reflect.Method`"
  (^java.lang.reflect.Method [^java.lang.Class clazz ^java.lang.String method-name ^java.lang.Class param-types]
    (ClassUtils/getMethod clazz method-name param-types)))

(defn *cglib-proxy-class?
  "clazz - `java.lang.Class`

  returns: `boolean`"
  (^Boolean [^java.lang.Class clazz]
    (ClassUtils/isCglibProxyClass clazz)))

(defn *class-names-to-string
  "classes - `java.lang.Class`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.Class classes]
    (ClassUtils/classNamesToString classes)))

(defn *get-all-interfaces-for-class
  "clazz - `java.lang.Class`
  class-loader - `java.lang.ClassLoader`

  returns: `java.lang.Class<?>[]`"
  ([^java.lang.Class clazz ^java.lang.ClassLoader class-loader]
    (ClassUtils/getAllInterfacesForClass clazz class-loader))
  ([^java.lang.Class clazz]
    (ClassUtils/getAllInterfacesForClass clazz)))

(defn *has-method?
  "clazz - `java.lang.Class`
  method-name - `java.lang.String`
  param-types - `java.lang.Class`

  returns: `boolean`"
  (^Boolean [^java.lang.Class clazz ^java.lang.String method-name ^java.lang.Class param-types]
    (ClassUtils/hasMethod clazz method-name param-types)))

(defn *get-descriptive-type
  "value - `java.lang.Object`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.Object value]
    (ClassUtils/getDescriptiveType value)))

(defn *get-static-method
  "clazz - `java.lang.Class`
  method-name - `java.lang.String`
  args - `java.lang.Class`

  returns: `java.lang.reflect.Method`"
  (^java.lang.reflect.Method [^java.lang.Class clazz ^java.lang.String method-name ^java.lang.Class args]
    (ClassUtils/getStaticMethod clazz method-name args)))

(defn *get-qualified-method-name
  "method - `java.lang.reflect.Method`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.reflect.Method method]
    (ClassUtils/getQualifiedMethodName method)))

(defn *override-thread-context-class-loader
  "class-loader-to-use - `java.lang.ClassLoader`

  returns: `java.lang.ClassLoader`"
  (^java.lang.ClassLoader [^java.lang.ClassLoader class-loader-to-use]
    (ClassUtils/overrideThreadContextClassLoader class-loader-to-use)))

