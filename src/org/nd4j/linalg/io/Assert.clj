(ns org.nd4j.linalg.io.Assert
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.io Assert]))

(defn ->assert
  "Constructor."
  (^Assert []
    (new Assert )))

(defn *no-null-elements
  "array - `java.lang.Object[]`
  message - `java.lang.String`"
  ([array ^java.lang.String message]
    (Assert/noNullElements array message))
  ([array]
    (Assert/noNullElements array)))

(defn *has-length
  "text - `java.lang.String`
  message - `java.lang.String`"
  ([^java.lang.String text ^java.lang.String message]
    (Assert/hasLength text message))
  ([^java.lang.String text]
    (Assert/hasLength text)))

(defn *is-assignable
  "super-type - `java.lang.Class`
  sub-type - `java.lang.Class`
  message - `java.lang.String`"
  ([^java.lang.Class super-type ^java.lang.Class sub-type ^java.lang.String message]
    (Assert/isAssignable super-type sub-type message))
  ([^java.lang.Class super-type ^java.lang.Class sub-type]
    (Assert/isAssignable super-type sub-type)))

(defn *is-null
  "object - `java.lang.Object`
  message - `java.lang.String`"
  ([^java.lang.Object object ^java.lang.String message]
    (Assert/isNull object message))
  ([^java.lang.Object object]
    (Assert/isNull object)))

(defn *not-null
  "object - `java.lang.Object`
  message - `java.lang.String`"
  ([^java.lang.Object object ^java.lang.String message]
    (Assert/notNull object message))
  ([^java.lang.Object object]
    (Assert/notNull object)))

(defn *does-not-contain
  "text-to-search - `java.lang.String`
  substring - `java.lang.String`
  message - `java.lang.String`"
  ([^java.lang.String text-to-search ^java.lang.String substring ^java.lang.String message]
    (Assert/doesNotContain text-to-search substring message))
  ([^java.lang.String text-to-search ^java.lang.String substring]
    (Assert/doesNotContain text-to-search substring)))

(defn *has-text
  "text - `java.lang.String`
  message - `java.lang.String`"
  ([^java.lang.String text ^java.lang.String message]
    (Assert/hasText text message))
  ([^java.lang.String text]
    (Assert/hasText text)))

(defn *not-empty
  "array - `java.lang.Object[]`
  message - `java.lang.String`"
  ([array ^java.lang.String message]
    (Assert/notEmpty array message))
  ([array]
    (Assert/notEmpty array)))

(defn *is-true
  "expression - `boolean`
  message - `java.lang.String`"
  ([^Boolean expression ^java.lang.String message]
    (Assert/isTrue expression message))
  ([^Boolean expression]
    (Assert/isTrue expression)))

(defn *state
  "expression - `boolean`
  message - `java.lang.String`"
  ([^Boolean expression ^java.lang.String message]
    (Assert/state expression message))
  ([^Boolean expression]
    (Assert/state expression)))

(defn *is-instance-of
  "type - `java.lang.Class`
  obj - `java.lang.Object`
  message - `java.lang.String`"
  ([^java.lang.Class type ^java.lang.Object obj ^java.lang.String message]
    (Assert/isInstanceOf type obj message))
  ([^java.lang.Class clazz ^java.lang.Object obj]
    (Assert/isInstanceOf clazz obj)))

