(ns org.deeplearning4j.ui.components.chart.ChartStackedArea
  "Stacked area chart (no normalization), with multiple series.
 Note that in the current implementation, the x values for each series must be the same"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.components.chart ChartStackedArea]))

(defn ->chart-stacked-area
  "Constructor.

  builder - `org.deeplearning4j.ui.components.chart.ChartStackedArea$Builder`"
  (^ChartStackedArea [^org.deeplearning4j.ui.components.chart.ChartStackedArea$Builder builder]
    (new ChartStackedArea builder))
  (^ChartStackedArea []
    (new ChartStackedArea )))

(def *-component-type
  "Static Constant.

  type: java.lang.String"
  ChartStackedArea/COMPONENT_TYPE)

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ChartStackedArea this]
    (-> this (.toString))))

