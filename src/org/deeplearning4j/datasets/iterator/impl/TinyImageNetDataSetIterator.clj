(ns org.deeplearning4j.datasets.iterator.impl.TinyImageNetDataSetIterator
  "Tiny ImageNet is a subset of the ImageNet database. TinyImageNet is the default course challenge for CS321n
 at Stanford University.
 Tiny ImageNet has 200 classes, each consisting of 500 training images.
 See: http://cs231n.stanford.edu/ and
 https://tiny-imagenet.herokuapp.com/"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.datasets.iterator.impl TinyImageNetDataSetIterator]))

(defn ->tiny-image-net-data-set-iterator
  "Constructor.

  Get the Tiny ImageNet iterator with specified train/test set and custom transform.

  batch-size - Size of each patch - `int`
  img-dim - Dimensions of desired output - for example, {64, 64} - `int[]`
  set - Train, test, or validation - `org.deeplearning4j.datasets.fetchers.DataSetType`
  image-transform - Additional image transform for output - `org.datavec.image.transform.ImageTransform`
  rng-seed - random number generator seed to use when shuffling examples - `long`"
  (^TinyImageNetDataSetIterator [^Integer batch-size img-dim ^org.deeplearning4j.datasets.fetchers.DataSetType set ^org.datavec.image.transform.ImageTransform image-transform ^Long rng-seed]
    (new TinyImageNetDataSetIterator batch-size img-dim set image-transform rng-seed))
  (^TinyImageNetDataSetIterator [^Integer batch-size img-dim ^org.deeplearning4j.datasets.fetchers.DataSetType set]
    (new TinyImageNetDataSetIterator batch-size img-dim set))
  (^TinyImageNetDataSetIterator [^Integer batch-size ^org.deeplearning4j.datasets.fetchers.DataSetType set]
    (new TinyImageNetDataSetIterator batch-size set))
  (^TinyImageNetDataSetIterator [^Integer batch-size]
    (new TinyImageNetDataSetIterator batch-size)))

