(ns org.nd4j.linalg.dimensionalityreduction.PCA
  "PCA class for dimensionality reduction and general analysis"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.dimensionalityreduction PCA]))

(defn ->pca
  "Constructor.

  Create a PCA instance with calculated data: covariance, mean, eigenvectors, and eigenvalues.

  dataset - The set of data (records) of features, each row is a data record and eachcolumn is a feature, every data record has the same number of features. - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^PCA [^org.nd4j.linalg.api.ndarray.INDArray dataset]
    (new PCA dataset)))

(defn *pca
  "Calculates pca vectors of a matrix, for a flags number of reduced features
  returns the reduced feature set
  The return is a projection of A onto principal nDims components
  To use the PCA: assume A is the original feature set
  then project A onto a reduced set of features. It is possible to
  reconstruct the original data ( losing information, but having the same
  dimensionality )


   INDArray Areduced = A.mmul( factor ) ;
   INDArray Aoriginal = Areduced.mmul( factor.transpose() ) ;

  a - the array of features, rows are results, columns are features - will be changed - `org.nd4j.linalg.api.ndarray.INDArray`
  n-dims - the number of components on which to project the features - `int`
  normalize - whether to normalize (adjust each feature to have zero mean) - `boolean`

  returns: the reduced parameters of A - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray a ^Integer n-dims ^Boolean normalize]
    (PCA/pca a n-dims normalize)))

(defn *pca-factor
  "Calculates pca factors of a matrix, for a flags number of reduced features
  returns the factors to scale observations
  The return is a factor matrix to reduce (normalized) feature sets

  a - the array of features, rows are results, columns are features - will be changed - `org.nd4j.linalg.api.ndarray.INDArray`
  n-dims - the number of components on which to project the features - `int`
  normalize - whether to normalize (adjust each feature to have zero mean) - `boolean`

  returns: the reduced feature set - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray a ^Integer n-dims ^Boolean normalize]
    (PCA/pca_factor a n-dims normalize)))

(defn *pca-2
  "This method performs a dimensionality reduction, including principal components
  that cover a fraction of the total variance of the system. It does all calculations
  about the mean.

  in - A matrix of datapoints as rows, where column are features with fixed number N - `org.nd4j.linalg.api.ndarray.INDArray`
  variance - The desired fraction of the total variance required - `double`

  returns: The reduced basis set - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray in ^Double variance]
    (PCA/pca2 in variance)))

(defn *covariance-matrix
  "Returns the covariance matrix of a data set of many records, each with N features.
  It also returns the average values, which are usually going to be important since in this
  version, all modes are centered around the mean. It's a matrix that has elements that are
  expressed as average dx_i * dx_j (used in procedure) or average x_i * x_j - average x_i * average x_j

  in - A matrix of vectors of fixed length N (N features) on each row - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: INDArray[2], an N x N covariance matrix is element 0, and the average values is element 1. - `org.nd4j.linalg.api.ndarray.INDArray[]`"
  ([^org.nd4j.linalg.api.ndarray.INDArray in]
    (PCA/covarianceMatrix in)))

(defn *principal-components
  "Calculates the principal component vectors and their eigenvalues (lambda) for the covariance matrix.
  The result includes two things: the eigenvectors (modes) as result[0] and the eigenvalues (lambda)
  as result[1].

  cov - The covariance matrix (calculated with the covarianceMatrix(in) method) - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: Array INDArray[2] \"result\". The principal component vectors in decreasing flexibility are
  the columns of element 0 and the eigenvalues are element 1. - `org.nd4j.linalg.api.ndarray.INDArray[]`"
  ([^org.nd4j.linalg.api.ndarray.INDArray cov]
    (PCA/principalComponents cov)))

(defn get-covariance-matrix
  "returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^PCA this]
    (-> this (.getCovarianceMatrix))))

(defn convert-to-components
  "Takes a set of data on each row, with the same number of features as the constructing data
  and returns the data in the coordinates of the basis set about the mean.

  data - Data of the same features used to construct the PCA object - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: The record in terms of the principal component vectors, you can set unused ones to zero. - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^PCA this ^org.nd4j.linalg.api.ndarray.INDArray data]
    (-> this (.convertToComponents data))))

(defn estimate-variance
  "Estimate the variance of a single record with reduced # of dimensions.

  data - A single record with the same N features as the constructing data set - `org.nd4j.linalg.api.ndarray.INDArray`
  ndims - The number of dimensions to include in calculation - `int`

  returns: The fraction (0 to 1) of the total variance covered by the ndims basis set. - `double`"
  (^Double [^PCA this ^org.nd4j.linalg.api.ndarray.INDArray data ^Integer ndims]
    (-> this (.estimateVariance data ndims))))

(defn get-eigenvectors
  "returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^PCA this]
    (-> this (.getEigenvectors))))

(defn get-mean
  "returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^PCA this]
    (-> this (.getMean))))

(defn reduced-basis
  "Return a reduced basis set that covers a certain fraction of the variance of the data

  variance - The desired fractional variance (0 to 1), it will always be greater than the value. - `double`

  returns: The basis vectors as columns, size N rows by ndims columns, where ndims is less than or equal to N - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^PCA this ^Double variance]
    (-> this (.reducedBasis variance))))

(defn generate-gaussian-samples
  "Generates a set of count random samples with the same variance and mean and eigenvector/values
  as the data set used to initialize the PCA object, with same number of features N.

  count - The number of samples to generate - `long`

  returns: A matrix of size count rows by N columns - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^PCA this ^Long count]
    (-> this (.generateGaussianSamples count))))

(defn convert-back-to-features
  "Take the data that has been transformed to the principal components about the mean and
  transform it back into the original feature set. Make sure to fill in zeroes in columns
  where components were dropped!

  data - Data of the same features used to construct the PCA object but as the components - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: The records in terms of the original features - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^PCA this ^org.nd4j.linalg.api.ndarray.INDArray data]
    (-> this (.convertBackToFeatures data))))

(defn get-eigenvalues
  "returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^PCA this]
    (-> this (.getEigenvalues))))

