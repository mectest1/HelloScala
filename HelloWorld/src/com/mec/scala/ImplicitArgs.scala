package com.mec.scala

object ImplicitArgs {
  
  
  def main(args: Array[String]){
    {
      import SimpleStateSalesTax.rate
      val amount = 100f;
      println(s"Tax on $amount = ${calcTax(amount)}")
    }
    {
      import ComplicatedSalesTax.rate
      implicit val mayStore = ComplicatedSalesTaxData(0.06f, false, 1010)
      
      val amount = 100f
      println(s"Tax on $amount = ${calcTax(amount)}")
    }
  }
  

  def calcTax(amount: Float)(implicit rate: Float):Float = amount * rate
  object SimpleStateSalesTax{
    implicit val rate: Float = 0.05f
  }
  case class ComplicatedSalesTaxData(
    baseRate: Float,
    isTaxHoliday: Boolean,
    storeId: Int
  )
  object ComplicatedSalesTax{
    private def extraTaxRateForStore(id: Int): Float = {
        //
        0.0f
    }
    implicit def rate(implicit cstd: ComplicatedSalesTaxData): Float = {
      if(cstd.isTaxHoliday) 0.0f
      else cstd.baseRate + extraTaxRateForStore(cstd.storeId)
    }
  }
}
