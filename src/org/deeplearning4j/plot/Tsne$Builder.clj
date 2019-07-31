(ns org.deeplearning4j.plot.Tsne$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.plot Tsne$Builder]))

(defn ->builder
  "Constructor."
  (^Tsne$Builder []
    (new Tsne$Builder )))

(defn set-momentum
  "momentum - `double`

  returns: `org.deeplearning4j.plot.Tsne$Builder`"
  (^org.deeplearning4j.plot.Tsne$Builder [^Tsne$Builder this ^Double momentum]
    (-> this (.setMomentum momentum))))

(defn set-switch-momentum-iteration
  "switch-momentum-iteration - `int`

  returns: `org.deeplearning4j.plot.Tsne$Builder`"
  (^org.deeplearning4j.plot.Tsne$Builder [^Tsne$Builder this ^Integer switch-momentum-iteration]
    (-> this (.setSwitchMomentumIteration switch-momentum-iteration))))

(defn learning-rate
  "learning-rate - `double`

  returns: `org.deeplearning4j.plot.Tsne$Builder`"
  (^org.deeplearning4j.plot.Tsne$Builder [^Tsne$Builder this ^Double learning-rate]
    (-> this (.learningRate learning-rate))))

(defn use-ada-grad
  "use-ada-grad - `boolean`

  returns: `org.deeplearning4j.plot.Tsne$Builder`"
  (^org.deeplearning4j.plot.Tsne$Builder [^Tsne$Builder this ^Boolean use-ada-grad]
    (-> this (.useAdaGrad use-ada-grad))))

(defn normalize
  "normalize - `boolean`

  returns: `org.deeplearning4j.plot.Tsne$Builder`"
  (^org.deeplearning4j.plot.Tsne$Builder [^Tsne$Builder this ^Boolean normalize]
    (-> this (.normalize normalize))))

(defn set-initial-momentum
  "initial-momentum - `double`

  returns: `org.deeplearning4j.plot.Tsne$Builder`"
  (^org.deeplearning4j.plot.Tsne$Builder [^Tsne$Builder this ^Double initial-momentum]
    (-> this (.setInitialMomentum initial-momentum))))

(defn set-max-iter
  "max-iter - `int`

  returns: `org.deeplearning4j.plot.Tsne$Builder`"
  (^org.deeplearning4j.plot.Tsne$Builder [^Tsne$Builder this ^Integer max-iter]
    (-> this (.setMaxIter max-iter))))

(defn stop-lying-iteration
  "stop-lying-iteration - `int`

  returns: `org.deeplearning4j.plot.Tsne$Builder`"
  (^org.deeplearning4j.plot.Tsne$Builder [^Tsne$Builder this ^Integer stop-lying-iteration]
    (-> this (.stopLyingIteration stop-lying-iteration))))

(defn build
  "returns: `org.deeplearning4j.plot.Tsne`"
  (^org.deeplearning4j.plot.Tsne [^Tsne$Builder this]
    (-> this (.build))))

(defn set-real-min
  "real-min - `double`

  returns: `org.deeplearning4j.plot.Tsne$Builder`"
  (^org.deeplearning4j.plot.Tsne$Builder [^Tsne$Builder this ^Double real-min]
    (-> this (.setRealMin real-min))))

(defn perplexity
  "perplexity - `double`

  returns: `org.deeplearning4j.plot.Tsne$Builder`"
  (^org.deeplearning4j.plot.Tsne$Builder [^Tsne$Builder this ^Double perplexity]
    (-> this (.perplexity perplexity))))

(defn tolerance
  "tolerance - `double`

  returns: `org.deeplearning4j.plot.Tsne$Builder`"
  (^org.deeplearning4j.plot.Tsne$Builder [^Tsne$Builder this ^Double tolerance]
    (-> this (.tolerance tolerance))))

(defn use-pca
  "use-pca - `boolean`

  returns: `org.deeplearning4j.plot.Tsne$Builder`"
  (^org.deeplearning4j.plot.Tsne$Builder [^Tsne$Builder this ^Boolean use-pca]
    (-> this (.usePca use-pca))))

(defn min-gain
  "min-gain - `double`

  returns: `org.deeplearning4j.plot.Tsne$Builder`"
  (^org.deeplearning4j.plot.Tsne$Builder [^Tsne$Builder this ^Double min-gain]
    (-> this (.minGain min-gain))))

(defn set-final-momentum
  "final-momentum - `double`

  returns: `org.deeplearning4j.plot.Tsne$Builder`"
  (^org.deeplearning4j.plot.Tsne$Builder [^Tsne$Builder this ^Double final-momentum]
    (-> this (.setFinalMomentum final-momentum))))

