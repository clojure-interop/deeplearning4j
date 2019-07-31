(ns org.datavec.api.transform.ui.components.RenderableComponentLineChart$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.ui.components RenderableComponentLineChart$Builder]))

(defn ->builder
  "Constructor."
  (^RenderableComponentLineChart$Builder []
    (new RenderableComponentLineChart$Builder )))

(defn title
  "title - `java.lang.String`

  returns: `org.datavec.api.transform.ui.components.RenderableComponentLineChart$Builder`"
  (^org.datavec.api.transform.ui.components.RenderableComponentLineChart$Builder [^RenderableComponentLineChart$Builder this ^java.lang.String title]
    (-> this (.title title))))

(defn add-series
  "series-name - `java.lang.String`
  x-values - `double[]`
  y-values - `double[]`

  returns: `org.datavec.api.transform.ui.components.RenderableComponentLineChart$Builder`"
  (^org.datavec.api.transform.ui.components.RenderableComponentLineChart$Builder [^RenderableComponentLineChart$Builder this ^java.lang.String series-name x-values y-values]
    (-> this (.addSeries series-name x-values y-values))))

(defn set-remove-axis-horizontal
  "remove-axis-horizontal - `boolean`

  returns: `org.datavec.api.transform.ui.components.RenderableComponentLineChart$Builder`"
  (^org.datavec.api.transform.ui.components.RenderableComponentLineChart$Builder [^RenderableComponentLineChart$Builder this ^Boolean remove-axis-horizontal]
    (-> this (.setRemoveAxisHorizontal remove-axis-horizontal))))

(defn margins
  "top - `int`
  bottom - `int`
  left - `int`
  right - `int`

  returns: `org.datavec.api.transform.ui.components.RenderableComponentLineChart$Builder`"
  (^org.datavec.api.transform.ui.components.RenderableComponentLineChart$Builder [^RenderableComponentLineChart$Builder this ^Integer top ^Integer bottom ^Integer left ^Integer right]
    (-> this (.margins top bottom left right))))

(defn legend
  "legend - `boolean`

  returns: `org.datavec.api.transform.ui.components.RenderableComponentLineChart$Builder`"
  (^org.datavec.api.transform.ui.components.RenderableComponentLineChart$Builder [^RenderableComponentLineChart$Builder this ^Boolean legend]
    (-> this (.legend legend))))

(defn build
  "returns: `org.datavec.api.transform.ui.components.RenderableComponentLineChart`"
  (^org.datavec.api.transform.ui.components.RenderableComponentLineChart [^RenderableComponentLineChart$Builder this]
    (-> this (.build))))

