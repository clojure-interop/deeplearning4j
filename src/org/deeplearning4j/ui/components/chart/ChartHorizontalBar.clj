(ns org.deeplearning4j.ui.components.chart.ChartHorizontalBar
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.components.chart ChartHorizontalBar]))

(defn ->chart-horizontal-bar
  "Constructor."
  (^ChartHorizontalBar []
    (new ChartHorizontalBar )))

(def *-component-type
  "Static Constant.

  type: java.lang.String"
  ChartHorizontalBar/COMPONENT_TYPE)

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ChartHorizontalBar this]
    (-> this (.toString))))

