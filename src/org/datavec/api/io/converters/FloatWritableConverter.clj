(ns org.datavec.api.io.converters.FloatWritableConverter
  "Convert a writable to a
 double"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.io.converters FloatWritableConverter]))

(defn ->float-writable-converter
  "Constructor."
  (^FloatWritableConverter []
    (new FloatWritableConverter )))

(defn convert
  "Description copied from interface: WritableConverter

  writable - the writable to convert - `org.datavec.api.writable.Writable`

  returns: the converted writable - `org.datavec.api.writable.Writable`

  throws: org.datavec.api.io.converters.WritableConverterException"
  (^org.datavec.api.writable.Writable [^FloatWritableConverter this ^org.datavec.api.writable.Writable writable]
    (-> this (.convert writable))))

