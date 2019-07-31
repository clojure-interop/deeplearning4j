(ns org.datavec.api.io.converters.SelfWritableConverter
  "Baseline writable converter"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.io.converters SelfWritableConverter]))

(defn ->self-writable-converter
  "Constructor."
  (^SelfWritableConverter []
    (new SelfWritableConverter )))

(defn convert
  "Description copied from interface: WritableConverter

  writable - the writable to convert - `org.datavec.api.writable.Writable`

  returns: the converted writable - `org.datavec.api.writable.Writable`"
  (^org.datavec.api.writable.Writable [^SelfWritableConverter this ^org.datavec.api.writable.Writable writable]
    (-> this (.convert writable))))

