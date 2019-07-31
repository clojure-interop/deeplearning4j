(ns org.datavec.api.transform.quality.columns.BytesQuality
  "Quality of a Bytes column"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.quality.columns BytesQuality]))

(defn ->bytes-quality
  "Constructor.

  count-valid - `long`
  count-invalid - `long`
  count-missing - `long`
  count-total - `long`"
  (^BytesQuality [^Long count-valid ^Long count-invalid ^Long count-missing ^Long count-total]
    (new BytesQuality count-valid count-invalid count-missing count-total))
  (^BytesQuality []
    (new BytesQuality )))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^BytesQuality this]
    (-> this (.toString))))

