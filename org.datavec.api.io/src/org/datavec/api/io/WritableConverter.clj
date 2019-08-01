(ns org.datavec.api.io.WritableConverter
  "Convert a writable to another writable (used for say: transitioning dates or categorical to numbers)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.io WritableConverter]))

(defn convert
  "Convert a writable to another kind of writable

  writable - the writable to convert - `org.datavec.api.writable.Writable`

  returns: the converted writable - `org.datavec.api.writable.Writable`

  throws: org.datavec.api.io.converters.WritableConverterException"
  (^org.datavec.api.writable.Writable [^WritableConverter this ^org.datavec.api.writable.Writable writable]
    (-> this (.convert writable))))

