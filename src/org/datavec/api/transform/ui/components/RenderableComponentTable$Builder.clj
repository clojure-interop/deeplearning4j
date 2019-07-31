(ns org.datavec.api.transform.ui.components.RenderableComponentTable$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.ui.components RenderableComponentTable$Builder]))

(defn ->builder
  "Constructor."
  (^RenderableComponentTable$Builder []
    (new RenderableComponentTable$Builder )))

(defn table
  "table - `java.lang.String[][]`

  returns: `org.datavec.api.transform.ui.components.RenderableComponentTable$Builder`"
  (^org.datavec.api.transform.ui.components.RenderableComponentTable$Builder [^RenderableComponentTable$Builder this table]
    (-> this (.table table))))

(defn background-color
  "background-color - `java.lang.String`

  returns: `org.datavec.api.transform.ui.components.RenderableComponentTable$Builder`"
  (^org.datavec.api.transform.ui.components.RenderableComponentTable$Builder [^RenderableComponentTable$Builder this ^java.lang.String background-color]
    (-> this (.backgroundColor background-color))))

(defn col-widths-percent
  "col-widths-percent - `double`

  returns: `org.datavec.api.transform.ui.components.RenderableComponentTable$Builder`"
  (^org.datavec.api.transform.ui.components.RenderableComponentTable$Builder [^RenderableComponentTable$Builder this ^Double col-widths-percent]
    (-> this (.colWidthsPercent col-widths-percent))))

(defn pad-left-px
  "pad-left-px - `int`

  returns: `org.datavec.api.transform.ui.components.RenderableComponentTable$Builder`"
  (^org.datavec.api.transform.ui.components.RenderableComponentTable$Builder [^RenderableComponentTable$Builder this ^Integer pad-left-px]
    (-> this (.padLeftPx pad-left-px))))

(defn border
  "border - `int`

  returns: `org.datavec.api.transform.ui.components.RenderableComponentTable$Builder`"
  (^org.datavec.api.transform.ui.components.RenderableComponentTable$Builder [^RenderableComponentTable$Builder this ^Integer border]
    (-> this (.border border))))

(defn pad-right-px
  "pad-right-px - `int`

  returns: `org.datavec.api.transform.ui.components.RenderableComponentTable$Builder`"
  (^org.datavec.api.transform.ui.components.RenderableComponentTable$Builder [^RenderableComponentTable$Builder this ^Integer pad-right-px]
    (-> this (.padRightPx pad-right-px))))

(defn padding-px
  "left - `int`
  right - `int`
  top - `int`
  bottom - `int`

  returns: `org.datavec.api.transform.ui.components.RenderableComponentTable$Builder`"
  (^org.datavec.api.transform.ui.components.RenderableComponentTable$Builder [^RenderableComponentTable$Builder this ^Integer left ^Integer right ^Integer top ^Integer bottom]
    (-> this (.paddingPx left right top bottom)))
  (^org.datavec.api.transform.ui.components.RenderableComponentTable$Builder [^RenderableComponentTable$Builder this ^Integer padding-px]
    (-> this (.paddingPx padding-px))))

(defn pad-bottom-px
  "pad-bottom-px - `int`

  returns: `org.datavec.api.transform.ui.components.RenderableComponentTable$Builder`"
  (^org.datavec.api.transform.ui.components.RenderableComponentTable$Builder [^RenderableComponentTable$Builder this ^Integer pad-bottom-px]
    (-> this (.padBottomPx pad-bottom-px))))

(defn build
  "returns: `org.datavec.api.transform.ui.components.RenderableComponentTable`"
  (^org.datavec.api.transform.ui.components.RenderableComponentTable [^RenderableComponentTable$Builder this]
    (-> this (.build))))

(defn title
  "title - `java.lang.String`

  returns: `org.datavec.api.transform.ui.components.RenderableComponentTable$Builder`"
  (^org.datavec.api.transform.ui.components.RenderableComponentTable$Builder [^RenderableComponentTable$Builder this ^java.lang.String title]
    (-> this (.title title))))

(defn pad-top-px
  "pad-top-px - `int`

  returns: `org.datavec.api.transform.ui.components.RenderableComponentTable$Builder`"
  (^org.datavec.api.transform.ui.components.RenderableComponentTable$Builder [^RenderableComponentTable$Builder this ^Integer pad-top-px]
    (-> this (.padTopPx pad-top-px))))

(defn header
  "header - `java.lang.String`

  returns: `org.datavec.api.transform.ui.components.RenderableComponentTable$Builder`"
  (^org.datavec.api.transform.ui.components.RenderableComponentTable$Builder [^RenderableComponentTable$Builder this ^java.lang.String header]
    (-> this (.header header))))

(defn header-color
  "header-color - `java.lang.String`

  returns: `org.datavec.api.transform.ui.components.RenderableComponentTable$Builder`"
  (^org.datavec.api.transform.ui.components.RenderableComponentTable$Builder [^RenderableComponentTable$Builder this ^java.lang.String header-color]
    (-> this (.headerColor header-color))))

