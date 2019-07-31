(ns org.datavec.api.transform.ui.components.RenderableComponentHistogram$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.ui.components RenderableComponentHistogram$Builder]))

(defn ->builder
  "Constructor."
  (^RenderableComponentHistogram$Builder []
    (new RenderableComponentHistogram$Builder )))

(defn title
  "title - `java.lang.String`

  returns: `org.datavec.api.transform.ui.components.RenderableComponentHistogram$Builder`"
  (^org.datavec.api.transform.ui.components.RenderableComponentHistogram$Builder [^RenderableComponentHistogram$Builder this ^java.lang.String title]
    (-> this (.title title))))

(defn add-bin
  "lower - `double`
  upper - `double`
  y-value - `double`

  returns: `org.datavec.api.transform.ui.components.RenderableComponentHistogram$Builder`"
  (^org.datavec.api.transform.ui.components.RenderableComponentHistogram$Builder [^RenderableComponentHistogram$Builder this ^Double lower ^Double upper ^Double y-value]
    (-> this (.addBin lower upper y-value))))

(defn margins
  "top - `int`
  bottom - `int`
  left - `int`
  right - `int`

  returns: `org.datavec.api.transform.ui.components.RenderableComponentHistogram$Builder`"
  (^org.datavec.api.transform.ui.components.RenderableComponentHistogram$Builder [^RenderableComponentHistogram$Builder this ^Integer top ^Integer bottom ^Integer left ^Integer right]
    (-> this (.margins top bottom left right))))

(defn build
  "returns: `org.datavec.api.transform.ui.components.RenderableComponentHistogram`"
  (^org.datavec.api.transform.ui.components.RenderableComponentHistogram [^RenderableComponentHistogram$Builder this]
    (-> this (.build))))

