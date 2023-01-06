package booking;

import restaurant.Restaurant;

import java.time.LocalDateTime;
import java.util.*;

public class BookingManager {

    private static BookingManager instance;
    private Map<LocalDateTime, Integer> capacityAvailable; // Mappa per tenere traccia della capienza disponibile per ogni data
    private List<Booking> bookingList; // Lista di prenotazioni

    // Costruttore privato per implementare il pattern Singleton
    private BookingManager() {
        this.bookingList = new ArrayList<>(); // Inizializza la lista di prenotazioni
        this.capacityAvailable = new Hashtable<>(); // Inizializza la mappa della capienza disponibile
    }

    // Metodo per ottenere l'istanza del BookingManager
    public static BookingManager getInstance() {
        if (instance == null) { // Se l'istanza non esiste ancora, crearla
            instance = new BookingManager();
        }
        return instance; // Restituisci l'istanza del BookingManager
    }


    // Metodo per creare una nuova prenotazione
    public void createBooking(Customer customer, Restaurant restaurant, LocalDateTime bookingDate, int groupSize, String optionalMessage) {
        if (restaurant.getIsOpen() && getAvailableSeats(bookingDate, restaurant) >= groupSize) { // Se il ristorante è aperto e ci sono abbastanza posti disponibili per il gruppo di questa prenotazione
            Booking booking = new Booking(restaurant, customer.getCustomerId(), bookingDate, groupSize, optionalMessage); // Crea una nuova prenotazione e stampa messaggio di conferma

            System.out.println("Booking nr "+booking.getBookingId()+
                    " under the name "+customer.getName()+" "+customer.getSurname()+
                    " successfully done.");

            this.capacityAvailable.put(bookingDate, groupSize); // Aggiorna la capienza disponibile per la data della prenotazione
            this.bookingList.add(booking); // Aggiungi la prenotazione alla lista
        } else { // Se il ristorante è chiuso o non ci sono abbastanza posti disponibili
            System.out.println("No places available on date "+bookingDate); // Stampa un messaggio di errore
        }
    }

    // Metodo per modificare una prenotazione esistente
    public void modifyBooking(Customer customer, LocalDateTime bookingDate, LocalDateTime newBookingDate, int newGroupSize) {
        boolean bookingFound = false; // Flag per verificare se la prenotazione è stata trovata
        for (Booking bookingToModify : bookingList) {
                if (bookingToModify.getCustomerId() == customer.getCustomerId() && bookingToModify.getBookingDate().equals(bookingDate)) {// Se la prenotazione appartiene al cliente specificato e alla data specificata
                    bookingFound = true; // Imposta il flag di prenotazione trovata a vero
                    Restaurant restaurant = bookingToModify.getRestaurant(); // Ottieni il ristorante associato alla prenotazione
                    int availableSeats = getAvailableSeats(newBookingDate, restaurant); // Ottieni il numero di posti disponibili per la nuova data della prenotazione
                    if (availableSeats >= newGroupSize) { // Se ci sono abbastanza posti disponibili per il nuovo gruppo
                        capacityAvailable.put(newBookingDate, newGroupSize); // Aggiorna la capienza disponibile per la nuova data della prenotazione
                        System.out.println("Booking nr " + bookingToModify.getBookingId() +
                                          " under the name " + customer.getName() + " " + customer.getSurname() +
                                          " successfully modified.");
                    } else { // Se non ci sono abbastanza posti disponibili per il nuovo gruppo stampa messaggio di errore
                        System.out.println("Not enough seats available on date " + bookingDate);
                    }
                    break;// Esci dal ciclo
            }
        }
        if (!bookingFound){ // Se la prenotazione non è stata trovata stampa messaggio di errore
            System.out.println("Booking not found");
        }
    }

    // Metodo per eliminare una prenotazione esistente
    public void deleteBooking(Customer customer, LocalDateTime bookingDate) {
        for (int i = 0; i < bookingList.size(); i++) { // Per ogni prenotazione nella lista
            Booking bookingToDelete = bookingList.get(i); // Ottieni la prenotazione
            if (bookingToDelete.getCustomerId() == customer.getCustomerId() && bookingToDelete.getBookingDate().equals(bookingDate)) { // Se la prenotazione appartiene al cliente specificato e alla data specificata
                bookingList.remove(i); // Rimuovi la prenotazione dalla lista
                System.out.println("Booking nr "+bookingToDelete.getBookingId()+
                                  " under the name "+ customer.getSurname()+
                                  " on date "+ bookingToDelete.getBookingDate()+
                                  " deleted."
                );
                break; // Esci dal ciclo
            }else { // Se la prenotazione non è stata trovata stampa messaggio di errore
                System.out.println("Booking not found.");
            }
        }

    }

    // Metodo per ottenere il numero di posti disponibili per una determinata data e ristorante
    public int getAvailableSeats(LocalDateTime time, Restaurant restaurant) {
        int bookedTables = 0; // Contatore per il numero di tavoli prenotati
        for (Booking booking : bookingList) { // Per ogni prenotazione nella lista
            if (booking.getBookingDate().equals(time)) { // Se la prenotazione ha luogo nella data specificata
                bookedTables += booking.getGroupSize(); // Aggiungi il numero di persone del gruppo della prenotazione al contatore
            }
        }
        return restaurant.getSeatingCapacity() - bookedTables; // Restituisci la capienza del ristorante meno il numero di tavoli prenotati
    }


    public void printBookingList(){
        System.out.println("BOOKING LIST.\nBookings present: "+bookingList.size());
        for (Booking booking: bookingList) {
             booking.printBookingDetails();
        }
    }
}
