(ns org.nd4j.linalg.io.ObjectUtils
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.io ObjectUtils]))

(defn ->object-utils
  "Constructor."
  (^ObjectUtils []
    (new ObjectUtils )))

(defn *contains-constant
  "enum-values - `java.lang.Enum[]`
  constant - `java.lang.String`
  case-sensitive - `boolean`

  returns: `boolean`"
  (^Boolean [enum-values ^java.lang.String constant ^Boolean case-sensitive]
    (ObjectUtils/containsConstant enum-values constant case-sensitive))
  (^Boolean [enum-values ^java.lang.String constant]
    (ObjectUtils/containsConstant enum-values constant)))

(defn *to-object-array
  "source - `java.lang.Object`

  returns: `java.lang.Object[]`"
  ([^java.lang.Object source]
    (ObjectUtils/toObjectArray source)))

(defn *case-insensitive-value-of
  "enum-values - `E[]`
  constant - `java.lang.String`

  returns: `<E extends java.lang.Enum<?>> E`"
  ([enum-values ^java.lang.String constant]
    (ObjectUtils/caseInsensitiveValueOf enum-values constant)))

(defn *array?
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^java.lang.Object obj]
    (ObjectUtils/isArray obj)))

(defn *get-identity-hex-string
  "obj - `java.lang.Object`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.Object obj]
    (ObjectUtils/getIdentityHexString obj)))

(defn *add-object-to-array
  "array - `A[]`
  obj - `O`

  returns: `<A,O extends A> A[]`"
  ([array obj]
    (ObjectUtils/addObjectToArray array obj)))

(defn *compatible-with-throws-clause?
  "ex - `java.lang.Throwable`
  declared-exceptions - `java.lang.Class[]`

  returns: `boolean`"
  (^Boolean [^java.lang.Throwable ex declared-exceptions]
    (ObjectUtils/isCompatibleWithThrowsClause ex declared-exceptions)))

(defn *checked-exception?
  "ex - `java.lang.Throwable`

  returns: `boolean`"
  (^Boolean [^java.lang.Throwable ex]
    (ObjectUtils/isCheckedException ex)))

(defn *null-safe-equals
  "o-1 - `java.lang.Object`
  o-2 - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^java.lang.Object o-1 ^java.lang.Object o-2]
    (ObjectUtils/nullSafeEquals o-1 o-2)))

(defn *null-safe-to-string
  "obj - `java.lang.Object`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.Object obj]
    (ObjectUtils/nullSafeToString obj)))

(defn *null-safe-class-name
  "obj - `java.lang.Object`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.Object obj]
    (ObjectUtils/nullSafeClassName obj)))

(defn *null-safe-hash-code
  "obj - `java.lang.Object`

  returns: `int`"
  (^Integer [^java.lang.Object obj]
    (ObjectUtils/nullSafeHashCode obj)))

(defn *hash-code
  "bool - `boolean`

  returns: `int`"
  (^Integer [^Boolean bool]
    (ObjectUtils/hashCode bool)))

(defn *get-display-string
  "obj - `java.lang.Object`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.Object obj]
    (ObjectUtils/getDisplayString obj)))

(defn *empty?
  "array - `java.lang.Object[]`

  returns: `boolean`"
  (^Boolean [array]
    (ObjectUtils/isEmpty array)))

(defn *identity-to-string
  "obj - `java.lang.Object`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.Object obj]
    (ObjectUtils/identityToString obj)))

(defn *contains-element
  "array - `java.lang.Object[]`
  element - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [array ^java.lang.Object element]
    (ObjectUtils/containsElement array element)))

