(ns org.nd4j.base.Preconditions
  "Utility method for method checking arguments."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.base Preconditions]))

(defn *check-argument
  "See checkArgument(boolean, String, Object...)

  b - `boolean`
  msg - `java.lang.String`
  arg-1 - `java.lang.Object`
  arg-2 - `java.lang.Object`
  arg-3 - `java.lang.Object`
  arg-4 - `java.lang.Object`
  arg-5 - `java.lang.Object`
  arg-6 - `java.lang.Object`"
  ([^Boolean b ^java.lang.String msg ^java.lang.Object arg-1 ^java.lang.Object arg-2 ^java.lang.Object arg-3 ^java.lang.Object arg-4 ^java.lang.Object arg-5 ^java.lang.Object arg-6]
    (Preconditions/checkArgument b msg arg-1 arg-2 arg-3 arg-4 arg-5 arg-6))
  ([^Boolean b ^java.lang.String msg ^java.lang.Object arg-1 ^java.lang.Object arg-2 ^java.lang.Object arg-3 ^java.lang.Object arg-4 ^java.lang.Object arg-5]
    (Preconditions/checkArgument b msg arg-1 arg-2 arg-3 arg-4 arg-5))
  ([^Boolean b ^java.lang.String msg ^Integer arg-1 ^Integer arg-2 ^Integer arg-3 ^Integer arg-4]
    (Preconditions/checkArgument b msg arg-1 arg-2 arg-3 arg-4))
  ([^Boolean b ^java.lang.String msg ^Integer arg-1 ^Integer arg-2 ^Integer arg-3]
    (Preconditions/checkArgument b msg arg-1 arg-2 arg-3))
  ([^Boolean b ^java.lang.String msg ^Integer arg-1 ^Integer arg-2]
    (Preconditions/checkArgument b msg arg-1 arg-2))
  ([^Boolean b ^java.lang.String msg ^Integer arg-1]
    (Preconditions/checkArgument b msg arg-1))
  ([^Boolean b ^java.lang.String message]
    (Preconditions/checkArgument b message))
  ([^Boolean b]
    (Preconditions/checkArgument b)))

(defn *check-state
  "See checkState(boolean, String, Object...)

  b - `boolean`
  msg - `java.lang.String`
  arg-1 - `java.lang.Object`
  arg-2 - `java.lang.Object`
  arg-3 - `java.lang.Object`
  arg-4 - `java.lang.Object`
  arg-5 - `java.lang.Object`
  arg-6 - `java.lang.Object`"
  ([^Boolean b ^java.lang.String msg ^java.lang.Object arg-1 ^java.lang.Object arg-2 ^java.lang.Object arg-3 ^java.lang.Object arg-4 ^java.lang.Object arg-5 ^java.lang.Object arg-6]
    (Preconditions/checkState b msg arg-1 arg-2 arg-3 arg-4 arg-5 arg-6))
  ([^Boolean b ^java.lang.String msg ^java.lang.Object arg-1 ^java.lang.Object arg-2 ^java.lang.Object arg-3 ^java.lang.Object arg-4 ^java.lang.Object arg-5]
    (Preconditions/checkState b msg arg-1 arg-2 arg-3 arg-4 arg-5))
  ([^Boolean b ^java.lang.String msg ^Integer arg-1 ^Integer arg-2 ^Integer arg-3 ^Integer arg-4]
    (Preconditions/checkState b msg arg-1 arg-2 arg-3 arg-4))
  ([^Boolean b ^java.lang.String msg ^Integer arg-1 ^Integer arg-2 ^Integer arg-3]
    (Preconditions/checkState b msg arg-1 arg-2 arg-3))
  ([^Boolean b ^java.lang.String msg ^Integer arg-1 ^Integer arg-2]
    (Preconditions/checkState b msg arg-1 arg-2))
  ([^Boolean b ^java.lang.String msg ^Integer arg-1]
    (Preconditions/checkState b msg arg-1))
  ([^Boolean b ^java.lang.String message]
    (Preconditions/checkState b message))
  ([^Boolean b]
    (Preconditions/checkState b)))

(defn *check-not-null
  "See checkNotNull(Object, String, Object...)

  o - `java.lang.Object`
  msg - `java.lang.String`
  arg-1 - `int`
  arg-2 - `int`
  arg-3 - `int`
  arg-4 - `int`"
  ([^java.lang.Object o ^java.lang.String msg ^Integer arg-1 ^Integer arg-2 ^Integer arg-3 ^Integer arg-4]
    (Preconditions/checkNotNull o msg arg-1 arg-2 arg-3 arg-4))
  ([^java.lang.Object o ^java.lang.String msg ^Integer arg-1 ^Integer arg-2 ^Integer arg-3]
    (Preconditions/checkNotNull o msg arg-1 arg-2 arg-3))
  ([^java.lang.Object o ^java.lang.String msg ^Integer arg-1 ^Integer arg-2]
    (Preconditions/checkNotNull o msg arg-1 arg-2))
  ([^java.lang.Object o ^java.lang.String msg ^Integer arg-1]
    (Preconditions/checkNotNull o msg arg-1))
  ([^java.lang.Object o ^java.lang.String message]
    (Preconditions/checkNotNull o message))
  ([^java.lang.Object o]
    (Preconditions/checkNotNull o)))

(defn *throw-ex
  "message - `java.lang.String`
  args - `java.lang.Object`"
  ([^java.lang.String message ^java.lang.Object args]
    (Preconditions/throwEx message args)))

(defn *throw-state-ex
  "message - `java.lang.String`
  args - `java.lang.Object`"
  ([^java.lang.String message ^java.lang.Object args]
    (Preconditions/throwStateEx message args)))

(defn *throw-null-pointer-ex
  "message - `java.lang.String`
  args - `java.lang.Object`"
  ([^java.lang.String message ^java.lang.Object args]
    (Preconditions/throwNullPointerEx message args)))

