(ns org.datavec.api.io.converters.LabelWriterConverter
  "Convert a label in to an index based on the"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.io.converters LabelWriterConverter]))

(defn ->label-writer-converter
  "Constructor.

  labels - `java.util.List`"
  (^LabelWriterConverter [^java.util.List labels]
    (new LabelWriterConverter labels)))

(defn convert
  "Description copied from interface: WritableConverter

  writable - the writable to convert - `org.datavec.api.writable.Writable`

  returns: the converted writable - `org.datavec.api.writable.Writable`

  throws: org.datavec.api.io.converters.WritableConverterException"
  (^org.datavec.api.writable.Writable [^LabelWriterConverter this ^org.datavec.api.writable.Writable writable]
    (-> this (.convert writable))))

