(ns org.datavec.api.transform.analysis.quality.QualityAnalysisCombineFunction
  "Combine function used for undertaking analysis of a data set via Spark"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.analysis.quality QualityAnalysisCombineFunction]))

(defn ->quality-analysis-combine-function
  "Constructor."
  (^QualityAnalysisCombineFunction []
    (new QualityAnalysisCombineFunction )))

(defn apply
  "Description copied from interface: BiFunction

  l-1 - First argument - `java.util.List`
  l-2 - Second argument - `java.util.List`

  returns: Result - `java.util.List<org.datavec.api.transform.analysis.quality.QualityAnalysisState>`"
  (^java.util.List [^QualityAnalysisCombineFunction this ^java.util.List l-1 ^java.util.List l-2]
    (-> this (.apply l-1 l-2))))

