package com.asap.encuentro8;

import com.github.sanchezih.util.Fecha;

import java.util.List;

public class CarritoDeCompra {

        private String id;
        private List<Item> items;
        private MedioDePago medioDePago;
        private Fecha fecha;

        public CarritoDeCompra(String id, List<Item> items, MedioDePago medioDePago, Fecha fecha) {
                this.id = id;
                this.items = items;
                this.medioDePago = medioDePago;
                this.fecha = fecha;
        }

        public CarritoDeCompra() {
        }

        public String getId() {
                return id;
        }

        public void setId(String id) {
                this.id = id;
        }

        public List<Item> getItems() {
                return items;
        }

        public void setItems(List<Item> items) {
                this.items = items;
        }

        public MedioDePago getMedioDePago() {
                return medioDePago;
        }

        public void setMedioDePago(MedioDePago medioDePago) {
                this.medioDePago = medioDePago;
        }

        public Fecha getFecha() {
                return fecha;
        }

        public void setFecha(Fecha fecha) {
                this.fecha = fecha;
        }

        public double getPrecioBruto() {
                double total = 0;
                for (Item item : items) {
                        total += item.getSubTotal();
                }
                return total;
        }

        public double getTotal() {
                double precioBruto = getPrecioBruto();
                return medioDePago.calcularPrecioFinal(precioBruto, fecha);
        }

}
