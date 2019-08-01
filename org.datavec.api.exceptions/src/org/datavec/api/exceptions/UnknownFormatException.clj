(ns org.datavec.api.exceptions.UnknownFormatException
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.exceptions UnknownFormatException]))

(defn ->unknown-format-exception
  "Constructor.

  message - `java.lang.String`
  cause - `java.lang.Throwable`
  enable-suppression - `boolean`
  writable-stack-trace - `boolean`"
  (^UnknownFormatException [^java.lang.String message ^java.lang.Throwable cause ^Boolean enable-suppression ^Boolean writable-stack-trace]
    (new UnknownFormatException message cause enable-suppression writable-stack-trace))
  (^UnknownFormatException [^java.lang.String message ^java.lang.Throwable cause]
    (new UnknownFormatException message cause))
  (^UnknownFormatException [^java.lang.String message]
    (new UnknownFormatException message))
  (^UnknownFormatException []
    (new UnknownFormatException )))

