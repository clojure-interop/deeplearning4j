(ns org.nd4j.linalg.api.ops.exception.IllegalOpException
  "Thrown with illegal operations"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.exception IllegalOpException]))

(defn ->illegal-op-exception
  "Constructor.

  message - `java.lang.String`
  cause - `java.lang.Throwable`
  enable-suppression - `boolean`
  writable-stack-trace - `boolean`"
  (^IllegalOpException [^java.lang.String message ^java.lang.Throwable cause ^Boolean enable-suppression ^Boolean writable-stack-trace]
    (new IllegalOpException message cause enable-suppression writable-stack-trace))
  (^IllegalOpException [^java.lang.String message ^java.lang.Throwable cause]
    (new IllegalOpException message cause))
  (^IllegalOpException [^java.lang.String message]
    (new IllegalOpException message))
  (^IllegalOpException []
    (new IllegalOpException )))

