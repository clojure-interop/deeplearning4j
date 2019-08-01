(ns org.deeplearning4j.plot.BarnesHutTsne$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.plot BarnesHutTsne$Builder]))

(defn ->builder
  "Constructor."
  (^BarnesHutTsne$Builder []
    (new BarnesHutTsne$Builder )))

(defn set-momentum
  "momentum - `double`

  returns: `org.deeplearning4j.plot.BarnesHutTsne$Builder`"
  (^org.deeplearning4j.plot.BarnesHutTsne$Builder [^BarnesHutTsne$Builder this ^Double momentum]
    (-> this (.setMomentum momentum))))

(defn set-switch-momentum-iteration
  "switch-momentum-iteration - `int`

  returns: `org.deeplearning4j.plot.BarnesHutTsne$Builder`"
  (^org.deeplearning4j.plot.BarnesHutTsne$Builder [^BarnesHutTsne$Builder this ^Integer switch-momentum-iteration]
    (-> this (.setSwitchMomentumIteration switch-momentum-iteration))))

(defn learning-rate
  "learning-rate - `double`

  returns: `org.deeplearning4j.plot.BarnesHutTsne$Builder`"
  (^org.deeplearning4j.plot.BarnesHutTsne$Builder [^BarnesHutTsne$Builder this ^Double learning-rate]
    (-> this (.learningRate learning-rate))))

(defn use-ada-grad
  "use-ada-grad - `boolean`

  returns: `org.deeplearning4j.plot.BarnesHutTsne$Builder`"
  (^org.deeplearning4j.plot.BarnesHutTsne$Builder [^BarnesHutTsne$Builder this ^Boolean use-ada-grad]
    (-> this (.useAdaGrad use-ada-grad))))

(defn normalize
  "normalize - `boolean`

  returns: `org.deeplearning4j.plot.BarnesHutTsne$Builder`"
  (^org.deeplearning4j.plot.BarnesHutTsne$Builder [^BarnesHutTsne$Builder this ^Boolean normalize]
    (-> this (.normalize normalize))))

(defn num-dimension
  "num-dim - `int`

  returns: `org.deeplearning4j.plot.BarnesHutTsne$Builder`"
  (^org.deeplearning4j.plot.BarnesHutTsne$Builder [^BarnesHutTsne$Builder this ^Integer num-dim]
    (-> this (.numDimension num-dim))))

(defn set-initial-momentum
  "initial-momentum - `double`

  returns: `org.deeplearning4j.plot.BarnesHutTsne$Builder`"
  (^org.deeplearning4j.plot.BarnesHutTsne$Builder [^BarnesHutTsne$Builder this ^Double initial-momentum]
    (-> this (.setInitialMomentum initial-momentum))))

(defn set-max-iter
  "max-iter - `int`

  returns: `org.deeplearning4j.plot.BarnesHutTsne$Builder`"
  (^org.deeplearning4j.plot.BarnesHutTsne$Builder [^BarnesHutTsne$Builder this ^Integer max-iter]
    (-> this (.setMaxIter max-iter))))

(defn stop-lying-iteration
  "stop-lying-iteration - `int`

  returns: `org.deeplearning4j.plot.BarnesHutTsne$Builder`"
  (^org.deeplearning4j.plot.BarnesHutTsne$Builder [^BarnesHutTsne$Builder this ^Integer stop-lying-iteration]
    (-> this (.stopLyingIteration stop-lying-iteration))))

(defn vp-tree-workers
  "vp-tree-workers - `int`

  returns: `org.deeplearning4j.plot.BarnesHutTsne$Builder`"
  (^org.deeplearning4j.plot.BarnesHutTsne$Builder [^BarnesHutTsne$Builder this ^Integer vp-tree-workers]
    (-> this (.vpTreeWorkers vp-tree-workers))))

(defn workspace-mode
  "workspace-mode - `org.deeplearning4j.nn.conf.WorkspaceMode`

  returns: `org.deeplearning4j.plot.BarnesHutTsne$Builder`"
  (^org.deeplearning4j.plot.BarnesHutTsne$Builder [^BarnesHutTsne$Builder this ^org.deeplearning4j.nn.conf.WorkspaceMode workspace-mode]
    (-> this (.workspaceMode workspace-mode))))

(defn build
  "returns: `org.deeplearning4j.plot.BarnesHutTsne`"
  (^org.deeplearning4j.plot.BarnesHutTsne [^BarnesHutTsne$Builder this]
    (-> this (.build))))

(defn set-real-min
  "real-min - `double`

  returns: `org.deeplearning4j.plot.BarnesHutTsne$Builder`"
  (^org.deeplearning4j.plot.BarnesHutTsne$Builder [^BarnesHutTsne$Builder this ^Double real-min]
    (-> this (.setRealMin real-min))))

(defn perplexity
  "perplexity - `double`

  returns: `org.deeplearning4j.plot.BarnesHutTsne$Builder`"
  (^org.deeplearning4j.plot.BarnesHutTsne$Builder [^BarnesHutTsne$Builder this ^Double perplexity]
    (-> this (.perplexity perplexity))))

(defn tolerance
  "tolerance - `double`

  returns: `org.deeplearning4j.plot.BarnesHutTsne$Builder`"
  (^org.deeplearning4j.plot.BarnesHutTsne$Builder [^BarnesHutTsne$Builder this ^Double tolerance]
    (-> this (.tolerance tolerance))))

(defn similarity-function
  "similarity-function - `java.lang.String`

  returns: `org.deeplearning4j.plot.BarnesHutTsne$Builder`"
  (^org.deeplearning4j.plot.BarnesHutTsne$Builder [^BarnesHutTsne$Builder this ^java.lang.String similarity-function]
    (-> this (.similarityFunction similarity-function))))

(defn theta
  "theta - `double`

  returns: `org.deeplearning4j.plot.BarnesHutTsne$Builder`"
  (^org.deeplearning4j.plot.BarnesHutTsne$Builder [^BarnesHutTsne$Builder this ^Double theta]
    (-> this (.theta theta))))

(defn min-gain
  "min-gain - `double`

  returns: `org.deeplearning4j.plot.BarnesHutTsne$Builder`"
  (^org.deeplearning4j.plot.BarnesHutTsne$Builder [^BarnesHutTsne$Builder this ^Double min-gain]
    (-> this (.minGain min-gain))))

(defn set-final-momentum
  "final-momentum - `double`

  returns: `org.deeplearning4j.plot.BarnesHutTsne$Builder`"
  (^org.deeplearning4j.plot.BarnesHutTsne$Builder [^BarnesHutTsne$Builder this ^Double final-momentum]
    (-> this (.setFinalMomentum final-momentum))))

(defn invert-distance-metric
  "invert - `boolean`

  returns: `org.deeplearning4j.plot.BarnesHutTsne$Builder`"
  (^org.deeplearning4j.plot.BarnesHutTsne$Builder [^BarnesHutTsne$Builder this ^Boolean invert]
    (-> this (.invertDistanceMetric invert))))

