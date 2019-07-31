(ns org.deeplearning4j.ui.components.chart.ChartStackedArea$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.components.chart ChartStackedArea$Builder]))

(defn ->builder
  "Constructor.

  title - `java.lang.String`
  style - `org.deeplearning4j.ui.components.chart.style.StyleChart`"
  (^ChartStackedArea$Builder [^java.lang.String title ^org.deeplearning4j.ui.components.chart.style.StyleChart style]
    (new ChartStackedArea$Builder title style)))

(defn set-x-values
  "Set the x-axis values

  x - `double[]`

  returns: `org.deeplearning4j.ui.components.chart.ChartStackedArea$Builder`"
  (^org.deeplearning4j.ui.components.chart.ChartStackedArea$Builder [^ChartStackedArea$Builder this x]
    (-> this (.setXValues x))))

(defn add-series
  "Add a single series.

  series-name - Name of the series - `java.lang.String`
  y-values - length of the yValues array must be same as the x-values array - `double[]`

  returns: `org.deeplearning4j.ui.components.chart.ChartStackedArea$Builder`"
  (^org.deeplearning4j.ui.components.chart.ChartStackedArea$Builder [^ChartStackedArea$Builder this ^java.lang.String series-name y-values]
    (-> this (.addSeries series-name y-values))))

(defn build
  "returns: `org.deeplearning4j.ui.components.chart.ChartStackedArea`"
  (^org.deeplearning4j.ui.components.chart.ChartStackedArea [^ChartStackedArea$Builder this]
    (-> this (.build))))

