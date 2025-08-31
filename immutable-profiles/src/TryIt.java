import com.example.profiles.*;

public class TryIt {
    public static void main(String[] args) {
        ProfileService svc = new ProfileService();

        // Create minimal profile using builder
        UserProfile profile = svc.createMinimal("u123", "user@example.com");

        // Update display name immutably
        profile = svc.updateDisplayName(profile, "Jane Doe");

        System.out.println("ID: " + profile.getId());
        System.out.println("Email: " + profile.getEmail());
        System.out.println("Display Name: " + profile.getDisplayName());
    }
}