(ns org.deeplearning4j.ui.components.chart.Chart$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.components.chart Chart$Builder]))

(defn ->builder
  "Constructor.

  title - Title for the chart (may be null) - `java.lang.String`
  style - Style for the chart (may be null) - `org.deeplearning4j.ui.components.chart.style.StyleChart`"
  (^Chart$Builder [^java.lang.String title ^org.deeplearning4j.ui.components.chart.style.StyleChart style]
    (new Chart$Builder title style)))

(defn suppress-axis-horizontal
  "suppress-axis-horizontal - if true: don't show the horizontal axis (default: show) - `boolean`

  returns: `T`"
  ([^Chart$Builder this ^Boolean suppress-axis-horizontal]
    (-> this (.suppressAxisHorizontal suppress-axis-horizontal))))

(defn suppress-axis-vertical
  "suppress-axis-vertical - if true: don't show the vertical axis (default: show) - `boolean`

  returns: `T`"
  ([^Chart$Builder this ^Boolean suppress-axis-vertical]
    (-> this (.suppressAxisVertical suppress-axis-vertical))))

(defn show-legend
  "show-legend - if true: show the legend. (default: no legend) - `boolean`

  returns: `T`"
  ([^Chart$Builder this ^Boolean show-legend]
    (-> this (.showLegend show-legend))))

(defn set-x-min
  "Used to override/set the minimum value for the x axis. If this is not set, x axis minimum is set based on the data

  x-min - Minimum value to use for the x axis - `java.lang.Double`

  returns: `T`"
  ([^Chart$Builder this ^java.lang.Double x-min]
    (-> this (.setXMin x-min))))

(defn set-x-max
  "Used to override/set the maximum value for the x axis. If this is not set, x axis maximum is set based on the data

  x-max - Maximum value to use for the x axis - `java.lang.Double`

  returns: `T`"
  ([^Chart$Builder this ^java.lang.Double x-max]
    (-> this (.setXMax x-max))))

(defn set-y-min
  "Used to override/set the minimum value for the y axis. If this is not set, y axis minimum is set based on the data

  y-min - Minimum value to use for the y axis - `java.lang.Double`

  returns: `T`"
  ([^Chart$Builder this ^java.lang.Double y-min]
    (-> this (.setYMin y-min))))

(defn set-y-max
  "Used to override/set the maximum value for the y axis. If this is not set, y axis minimum is set based on the data

  y-max - Minimum value to use for the y axis - `java.lang.Double`

  returns: `T`"
  ([^Chart$Builder this ^java.lang.Double y-max]
    (-> this (.setYMax y-max))))

(defn set-grid-width
  "Set the grid lines to be enabled, and if enabled: set the grid.

  grid-vertical-stroke-width - If null (or 0): show no vertical grid. Otherwise: width in px - `java.lang.Double`
  grid-horizontal-stroke-width - If null (or 0): show no horizontal grid. Otherwise: width in px - `java.lang.Double`

  returns: `T`"
  ([^Chart$Builder this ^java.lang.Double grid-vertical-stroke-width ^java.lang.Double grid-horizontal-stroke-width]
    (-> this (.setGridWidth grid-vertical-stroke-width grid-horizontal-stroke-width))))

