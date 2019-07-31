(ns org.datavec.api.transform.quality.columns.StringQuality
  "Created by Alex on 5/03/2016."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.quality.columns StringQuality]))

(defn ->string-quality
  "Constructor.

  count-valid - `long`
  count-invalid - `long`
  count-missing - `long`
  count-total - `long`
  count-empty-string - `long`
  count-alphabetic - `long`
  count-numerical - `long`
  count-word-character - `long`
  count-whitespace - `long`
  hll - `com.clearspring.analytics.stream.cardinality.HyperLogLogPlus`"
  (^StringQuality [^Long count-valid ^Long count-invalid ^Long count-missing ^Long count-total ^Long count-empty-string ^Long count-alphabetic ^Long count-numerical ^Long count-word-character ^Long count-whitespace ^com.clearspring.analytics.stream.cardinality.HyperLogLogPlus hll]
    (new StringQuality count-valid count-invalid count-missing count-total count-empty-string count-alphabetic count-numerical count-word-character count-whitespace hll))
  (^StringQuality []
    (new StringQuality )))

(defn add
  "other - `org.datavec.api.transform.quality.columns.StringQuality`

  returns: `org.datavec.api.transform.quality.columns.StringQuality`"
  (^org.datavec.api.transform.quality.columns.StringQuality [^StringQuality this ^org.datavec.api.transform.quality.columns.StringQuality other]
    (-> this (.add other))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^StringQuality this]
    (-> this (.toString))))

