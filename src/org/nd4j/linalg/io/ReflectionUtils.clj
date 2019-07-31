(ns org.nd4j.linalg.io.ReflectionUtils
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.io ReflectionUtils]))

(defn ->reflection-utils
  "Constructor."
  (^ReflectionUtils []
    (new ReflectionUtils )))

(defn *-copyable-fields
  "Static Field.

  type: org.nd4j.linalg.io.ReflectionUtils$FieldFilter"
  []
  ReflectionUtils/COPYABLE_FIELDS)

(defn *-non-bridged-methods
  "Static Field.

  type: org.nd4j.linalg.io.ReflectionUtils$MethodFilter"
  []
  ReflectionUtils/NON_BRIDGED_METHODS)

(defn *-user-declared-methods
  "Static Field.

  type: org.nd4j.linalg.io.ReflectionUtils$MethodFilter"
  []
  ReflectionUtils/USER_DECLARED_METHODS)

(defn *do-with-fields
  "clazz - `java.lang.Class`
  fc - `org.nd4j.linalg.io.ReflectionUtils$FieldCallback`
  ff - `org.nd4j.linalg.io.ReflectionUtils$FieldFilter`

  throws: java.lang.IllegalArgumentException"
  ([^java.lang.Class clazz ^org.nd4j.linalg.io.ReflectionUtils$FieldCallback fc ^org.nd4j.linalg.io.ReflectionUtils$FieldFilter ff]
    (ReflectionUtils/doWithFields clazz fc ff))
  ([^java.lang.Class clazz ^org.nd4j.linalg.io.ReflectionUtils$FieldCallback fc]
    (ReflectionUtils/doWithFields clazz fc)))

(defn *do-with-methods
  "clazz - `java.lang.Class`
  mc - `org.nd4j.linalg.io.ReflectionUtils$MethodCallback`
  mf - `org.nd4j.linalg.io.ReflectionUtils$MethodFilter`

  throws: java.lang.IllegalArgumentException"
  ([^java.lang.Class clazz ^org.nd4j.linalg.io.ReflectionUtils$MethodCallback mc ^org.nd4j.linalg.io.ReflectionUtils$MethodFilter mf]
    (ReflectionUtils/doWithMethods clazz mc mf))
  ([^java.lang.Class clazz ^org.nd4j.linalg.io.ReflectionUtils$MethodCallback mc]
    (ReflectionUtils/doWithMethods clazz mc)))

(defn *make-accessible
  "field - `java.lang.reflect.Field`"
  ([^java.lang.reflect.Field field]
    (ReflectionUtils/makeAccessible field)))

(defn *public-static-final?
  "field - `java.lang.reflect.Field`

  returns: `boolean`"
  (^Boolean [^java.lang.reflect.Field field]
    (ReflectionUtils/isPublicStaticFinal field)))

(defn *find-field
  "clazz - `java.lang.Class`
  name - `java.lang.String`
  type - `java.lang.Class`

  returns: `java.lang.reflect.Field`"
  (^java.lang.reflect.Field [^java.lang.Class clazz ^java.lang.String name ^java.lang.Class type]
    (ReflectionUtils/findField clazz name type))
  (^java.lang.reflect.Field [^java.lang.Class clazz ^java.lang.String name]
    (ReflectionUtils/findField clazz name)))

(defn *hash-code-method?
  "method - `java.lang.reflect.Method`

  returns: `boolean`"
  (^Boolean [^java.lang.reflect.Method method]
    (ReflectionUtils/isHashCodeMethod method)))

(defn *handle-invocation-target-exception
  "ex - `java.lang.reflect.InvocationTargetException`"
  ([^java.lang.reflect.InvocationTargetException ex]
    (ReflectionUtils/handleInvocationTargetException ex)))

(defn *invoke-method
  "method - `java.lang.reflect.Method`
  target - `java.lang.Object`
  args - `java.lang.Object`

  returns: `java.lang.Object`"
  (^java.lang.Object [^java.lang.reflect.Method method ^java.lang.Object target ^java.lang.Object args]
    (ReflectionUtils/invokeMethod method target args))
  (^java.lang.Object [^java.lang.reflect.Method method ^java.lang.Object target]
    (ReflectionUtils/invokeMethod method target)))

(defn *handle-reflection-exception
  "ex - `java.lang.Exception`"
  ([^java.lang.Exception ex]
    (ReflectionUtils/handleReflectionException ex)))

(defn *get-all-declared-methods
  "leaf-class - `java.lang.Class`

  returns: `java.lang.reflect.Method[]`

  throws: java.lang.IllegalArgumentException"
  ([^java.lang.Class leaf-class]
    (ReflectionUtils/getAllDeclaredMethods leaf-class)))

(defn *get-unique-declared-methods
  "leaf-class - `java.lang.Class`

  returns: `java.lang.reflect.Method[]`

  throws: java.lang.IllegalArgumentException"
  ([^java.lang.Class leaf-class]
    (ReflectionUtils/getUniqueDeclaredMethods leaf-class)))

(defn *cglib-renamed-method?
  "renamed-method - `java.lang.reflect.Method`

  returns: `boolean`"
  (^Boolean [^java.lang.reflect.Method renamed-method]
    (ReflectionUtils/isCglibRenamedMethod renamed-method)))

(defn *shallow-copy-field-state
  "src - `java.lang.Object`
  dest - `java.lang.Object`

  throws: java.lang.IllegalArgumentException"
  ([^java.lang.Object src ^java.lang.Object dest]
    (ReflectionUtils/shallowCopyFieldState src dest)))

(defn *set-field
  "field - `java.lang.reflect.Field`
  target - `java.lang.Object`
  value - `java.lang.Object`"
  ([^java.lang.reflect.Field field ^java.lang.Object target ^java.lang.Object value]
    (ReflectionUtils/setField field target value)))

(defn *equals-method?
  "method - `java.lang.reflect.Method`

  returns: `boolean`"
  (^Boolean [^java.lang.reflect.Method method]
    (ReflectionUtils/isEqualsMethod method)))

(defn *to-string-method?
  "method - `java.lang.reflect.Method`

  returns: `boolean`"
  (^Boolean [^java.lang.reflect.Method method]
    (ReflectionUtils/isToStringMethod method)))

(defn *get-field
  "field - `java.lang.reflect.Field`
  target - `java.lang.Object`

  returns: `java.lang.Object`"
  (^java.lang.Object [^java.lang.reflect.Field field ^java.lang.Object target]
    (ReflectionUtils/getField field target)))

(defn *rethrow-runtime-exception
  "ex - `java.lang.Throwable`"
  ([^java.lang.Throwable ex]
    (ReflectionUtils/rethrowRuntimeException ex)))

(defn *invoke-jdbc-method
  "method - `java.lang.reflect.Method`
  target - `java.lang.Object`
  args - `java.lang.Object`

  returns: `java.lang.Object`

  throws: java.sql.SQLException"
  (^java.lang.Object [^java.lang.reflect.Method method ^java.lang.Object target ^java.lang.Object args]
    (ReflectionUtils/invokeJdbcMethod method target args))
  (^java.lang.Object [^java.lang.reflect.Method method ^java.lang.Object target]
    (ReflectionUtils/invokeJdbcMethod method target)))

(defn *object-method?
  "method - `java.lang.reflect.Method`

  returns: `boolean`"
  (^Boolean [^java.lang.reflect.Method method]
    (ReflectionUtils/isObjectMethod method)))

(defn *rethrow-exception
  "ex - `java.lang.Throwable`

  throws: java.lang.Exception"
  ([^java.lang.Throwable ex]
    (ReflectionUtils/rethrowException ex)))

(defn *declares-exception
  "method - `java.lang.reflect.Method`
  exception-type - `java.lang.Class`

  returns: `boolean`"
  (^Boolean [^java.lang.reflect.Method method ^java.lang.Class exception-type]
    (ReflectionUtils/declaresException method exception-type)))

(defn *find-method
  "clazz - `java.lang.Class`
  name - `java.lang.String`
  param-types - `java.lang.Class`

  returns: `java.lang.reflect.Method`"
  (^java.lang.reflect.Method [^java.lang.Class clazz ^java.lang.String name ^java.lang.Class param-types]
    (ReflectionUtils/findMethod clazz name param-types))
  (^java.lang.reflect.Method [^java.lang.Class clazz ^java.lang.String name]
    (ReflectionUtils/findMethod clazz name)))

