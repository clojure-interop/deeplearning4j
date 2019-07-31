(ns org.deeplearning4j.ui.components.chart.ChartHistogram
  "Histogram chart, with pre-binned values. Supports variable width bins"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.components.chart ChartHistogram]))

(defn ->chart-histogram
  "Constructor.

  builder - `org.deeplearning4j.ui.components.chart.ChartHistogram$Builder`"
  (^ChartHistogram [^org.deeplearning4j.ui.components.chart.ChartHistogram$Builder builder]
    (new ChartHistogram builder))
  (^ChartHistogram []
    (new ChartHistogram )))

(def *-component-type
  "Static Constant.

  type: java.lang.String"
  ChartHistogram/COMPONENT_TYPE)

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ChartHistogram this]
    (-> this (.toString))))

