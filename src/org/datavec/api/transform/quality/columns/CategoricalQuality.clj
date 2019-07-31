(ns org.datavec.api.transform.quality.columns.CategoricalQuality
  "Quality of a Categorical column"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.quality.columns CategoricalQuality]))

(defn ->categorical-quality
  "Constructor.

  count-valid - `long`
  count-invalid - `long`
  count-missing - `long`
  count-total - `long`"
  (^CategoricalQuality [^Long count-valid ^Long count-invalid ^Long count-missing ^Long count-total]
    (new CategoricalQuality count-valid count-invalid count-missing count-total))
  (^CategoricalQuality []
    (new CategoricalQuality )))

(defn add
  "other - `org.datavec.api.transform.quality.columns.CategoricalQuality`

  returns: `org.datavec.api.transform.quality.columns.CategoricalQuality`"
  (^org.datavec.api.transform.quality.columns.CategoricalQuality [^CategoricalQuality this ^org.datavec.api.transform.quality.columns.CategoricalQuality other]
    (-> this (.add other))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^CategoricalQuality this]
    (-> this (.toString))))

