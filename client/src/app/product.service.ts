import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ProductService {


  constructor(private httpclient: HttpClient) { }

  newsapi = "https://newsapi.org/v2/everything?q=food?&apiKey=218626ca2d6343ccbe5aa8b65120e4d1";

  saveProductDetail(data: any) {
    return this.httpclient.post("http://localhost:8080/saveProductDetails", data)
  }

  updateProduct(id: any, data: any) {
    return this.httpclient.put("http://localhost:8080/updateProductById/" + id, data)
  }

  //show list of product
  getProductData() {
    return this.httpclient.get("http://localhost:8080/getProductDetails");
  }

  //show product by product id
  getProductById(id: any) {
    return this.httpclient.get("http://localhost:8080/getProductById/" + id)
  }

  //delete Product by product id
  deleteProduct(id: any) {
    return this.httpclient.delete("http://localhost:8080/deleteProductById/" + id);
  }

  news()
  {
    return this.httpclient.get(this.newsapi);
  }
}
