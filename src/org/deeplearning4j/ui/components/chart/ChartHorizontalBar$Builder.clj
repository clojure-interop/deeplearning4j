(ns org.deeplearning4j.ui.components.chart.ChartHorizontalBar$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.components.chart ChartHorizontalBar$Builder]))

(defn ->builder
  "Constructor.

  title - `java.lang.String`
  style - `org.deeplearning4j.ui.components.chart.style.StyleChart`"
  (^ChartHorizontalBar$Builder [^java.lang.String title ^org.deeplearning4j.ui.components.chart.style.StyleChart style]
    (new ChartHorizontalBar$Builder title style)))

(defn add-value
  "name - `java.lang.String`
  value - `double`

  returns: `org.deeplearning4j.ui.components.chart.ChartHorizontalBar$Builder`"
  (^org.deeplearning4j.ui.components.chart.ChartHorizontalBar$Builder [^ChartHorizontalBar$Builder this ^java.lang.String name ^Double value]
    (-> this (.addValue name value))))

(defn add-values
  "names - `java.util.List`
  values - `double[]`

  returns: `org.deeplearning4j.ui.components.chart.ChartHorizontalBar$Builder`"
  (^org.deeplearning4j.ui.components.chart.ChartHorizontalBar$Builder [^ChartHorizontalBar$Builder this ^java.util.List names values]
    (-> this (.addValues names values))))

(defn x-min
  "x-min - `double`

  returns: `org.deeplearning4j.ui.components.chart.ChartHorizontalBar$Builder`"
  (^org.deeplearning4j.ui.components.chart.ChartHorizontalBar$Builder [^ChartHorizontalBar$Builder this ^Double x-min]
    (-> this (.xMin x-min))))

(defn x-max
  "x-max - `double`

  returns: `org.deeplearning4j.ui.components.chart.ChartHorizontalBar$Builder`"
  (^org.deeplearning4j.ui.components.chart.ChartHorizontalBar$Builder [^ChartHorizontalBar$Builder this ^Double x-max]
    (-> this (.xMax x-max))))

(defn build
  "returns: `org.deeplearning4j.ui.components.chart.ChartHorizontalBar`"
  (^org.deeplearning4j.ui.components.chart.ChartHorizontalBar [^ChartHorizontalBar$Builder this]
    (-> this (.build))))

