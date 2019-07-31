(ns org.datavec.api.io.converters.WritableConverterException
  "Writable converter exception represents an error
 for being unable to convert a writable"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.io.converters WritableConverterException]))

(defn ->writable-converter-exception
  "Constructor.

  message - `java.lang.String`
  cause - `java.lang.Throwable`
  enable-suppression - `boolean`
  writable-stack-trace - `boolean`"
  (^WritableConverterException [^java.lang.String message ^java.lang.Throwable cause ^Boolean enable-suppression ^Boolean writable-stack-trace]
    (new WritableConverterException message cause enable-suppression writable-stack-trace))
  (^WritableConverterException [^java.lang.String message ^java.lang.Throwable cause]
    (new WritableConverterException message cause))
  (^WritableConverterException [^java.lang.String message]
    (new WritableConverterException message))
  (^WritableConverterException []
    (new WritableConverterException )))

