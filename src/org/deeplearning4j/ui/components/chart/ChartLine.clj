(ns org.deeplearning4j.ui.components.chart.ChartLine
  "Line chart with multiple independent series"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.components.chart ChartLine]))

(defn ->chart-line
  "Constructor."
  (^ChartLine []
    (new ChartLine )))

(def *-component-type
  "Static Constant.

  type: java.lang.String"
  ChartLine/COMPONENT_TYPE)

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ChartLine this]
    (-> this (.toString))))

