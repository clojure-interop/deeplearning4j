(ns org.datavec.api.transform.analysis.quality.QualityAnalysisAddFunction
  "Add function used for undertaking quality analysis of a data set via Spark"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.analysis.quality QualityAnalysisAddFunction]))

(defn ->quality-analysis-add-function
  "Constructor."
  (^QualityAnalysisAddFunction []
    (new QualityAnalysisAddFunction )))

(defn apply
  "Description copied from interface: BiFunction

  analysis-states - First argument - `java.util.List`
  writables - Second argument - `java.util.List`

  returns: Result - `java.util.List<org.datavec.api.transform.analysis.quality.QualityAnalysisState>`"
  (^java.util.List [^QualityAnalysisAddFunction this ^java.util.List analysis-states ^java.util.List writables]
    (-> this (.apply analysis-states writables))))

