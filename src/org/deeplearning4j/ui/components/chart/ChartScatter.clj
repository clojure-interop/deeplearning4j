(ns org.deeplearning4j.ui.components.chart.ChartScatter
  "Scatter chart"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.components.chart ChartScatter]))

(defn ->chart-scatter
  "Constructor."
  (^ChartScatter []
    (new ChartScatter )))

(def *-component-type
  "Static Constant.

  type: java.lang.String"
  ChartScatter/COMPONENT_TYPE)

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ChartScatter this]
    (-> this (.toString))))

