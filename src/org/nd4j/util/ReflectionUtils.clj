(ns org.nd4j.util.ReflectionUtils
  "General reflection utils"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.util ReflectionUtils]))

(defn *set-contention-tracing
  "val - `boolean`"
  ([^Boolean val]
    (ReflectionUtils/setContentionTracing val)))

(defn *print-thread-info
  "Print all of the thread's information and stack traces.

  stream - the stream to - `java.io.PrintWriter`
  title - a string title for the stack trace - `java.lang.String`"
  ([^java.io.PrintWriter stream ^java.lang.String title]
    (ReflectionUtils/printThreadInfo stream title)))

(defn *get-class
  "Return the correctly-typed Class of the given object.

  o - object whose correctly-typed Class is to be obtained - `T`

  returns: the correctly typed Class of the given object. - `<T> java.lang.Class<T>`"
  ([o]
    (ReflectionUtils/getClass o)))

