(ns org.datavec.local.transforms.analysis.aggregate.AnalysisCombineFunction
  "Combine function used for undertaking analysis of a data set via Spark"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.local.transforms.analysis.aggregate AnalysisCombineFunction]))

(defn ->analysis-combine-function
  "Constructor."
  (^AnalysisCombineFunction []
    (new AnalysisCombineFunction )))

(defn apply
  "Description copied from interface: BiFunction

  l-1 - First argument - `java.util.List`
  l-2 - Second argument - `java.util.List`

  returns: Result - `java.util.List<org.datavec.api.transform.analysis.AnalysisCounter>`"
  (^java.util.List [^AnalysisCombineFunction this ^java.util.List l-1 ^java.util.List l-2]
    (-> this (.apply l-1 l-2))))

