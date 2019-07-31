(ns org.datavec.api.transform.analysis.quality.categorical.CategoricalQualityAddFunction
  "Created by Alex on 5/03/2016."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.analysis.quality.categorical CategoricalQualityAddFunction]))

(defn ->categorical-quality-add-function
  "Constructor."
  (^CategoricalQualityAddFunction []
    (new CategoricalQualityAddFunction )))

(defn apply
  "Description copied from interface: BiFunction

  v-1 - First argument - `org.datavec.api.transform.quality.columns.CategoricalQuality`
  writable - Second argument - `org.datavec.api.writable.Writable`

  returns: Result - `org.datavec.api.transform.quality.columns.CategoricalQuality`"
  (^org.datavec.api.transform.quality.columns.CategoricalQuality [^CategoricalQualityAddFunction this ^org.datavec.api.transform.quality.columns.CategoricalQuality v-1 ^org.datavec.api.writable.Writable writable]
    (-> this (.apply v-1 writable))))

