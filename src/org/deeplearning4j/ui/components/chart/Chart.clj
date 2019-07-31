(ns org.deeplearning4j.ui.components.chart.Chart
  "Abstract class for charts"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.components.chart Chart]))

(defn ->chart
  "Constructor.

  component-type - `java.lang.String`
  builder - `org.deeplearning4j.ui.components.chart.Chart$Builder`"
  (^Chart [^java.lang.String component-type ^org.deeplearning4j.ui.components.chart.Chart$Builder builder]
    (new Chart component-type builder))
  (^Chart [^java.lang.String component-type]
    (new Chart component-type)))

