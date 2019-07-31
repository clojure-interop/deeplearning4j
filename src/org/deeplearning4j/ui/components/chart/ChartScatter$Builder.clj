(ns org.deeplearning4j.ui.components.chart.ChartScatter$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.components.chart ChartScatter$Builder]))

(defn ->builder
  "Constructor.

  title - `java.lang.String`
  style - `org.deeplearning4j.ui.components.chart.style.StyleChart`"
  (^ChartScatter$Builder [^java.lang.String title ^org.deeplearning4j.ui.components.chart.style.StyleChart style]
    (new ChartScatter$Builder title style)))

(defn add-series
  "series-name - Name of the series - `java.lang.String`
  x-values - Array of x values - `double[]`
  y-values - Array of y values (such that a single point i has coordinates (x[i],y[i])) - `double[]`

  returns: `org.deeplearning4j.ui.components.chart.ChartScatter$Builder`"
  (^org.deeplearning4j.ui.components.chart.ChartScatter$Builder [^ChartScatter$Builder this ^java.lang.String series-name x-values y-values]
    (-> this (.addSeries series-name x-values y-values))))

(defn build
  "returns: `org.deeplearning4j.ui.components.chart.ChartScatter`"
  (^org.deeplearning4j.ui.components.chart.ChartScatter [^ChartScatter$Builder this]
    (-> this (.build))))

